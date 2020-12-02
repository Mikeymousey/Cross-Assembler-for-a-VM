package assembler;

public class Parser {
	private int tokenPos;
	private boolean label;
	private AssemblyUnit aUnit;
	private Lexicalanalyzer lex;
	private String type;
	public Parser(AssemblyUnit aUnit, Lexicalanalyzer lex) {
		tokenPos = 0;
		this.lex = lex;
		this.aUnit = aUnit;
	}
	
	public void parseLine(String s) {
		tokenPos = 0;
		if (s == null) {
			System.out.print("null string passed to parser");
			return;
		}
		char a = s.charAt(aUnit.currPos.getCharacter()); //for debugging purposes, unused in code
		if(s.charAt(0) == '\t') {
			label = false;
			String s0 = nextToken(s);
			type = lex.scanIdentifier(s0);
			switch(type) {
			case "Inherent":
				//if inherent there is nothing left to scan
				
				break;
			case "Immediate":
				//we know that the operand is immediate data, a number or label
				String expected = lex.expect(); //important that this is called before nextToken()
				String t = nextToken(s);
				switch(expected) {
				case "number":
					if(!isLetter(t.charAt(0))) {
						lex.scanNumber(t); //implied that this is an operand 
					} else {
						aUnit.errep.reportError("expected immediate data after an immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter()); 
					}
					break;
				case "label":
					if(isLetter(t.charAt(0))) {
						lex.scanLabel(t);
					} else {
						aUnit.errep.reportError("expected label after immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					}
					break;
				case "all": 
					if(isLetter(t.charAt(0))) {
						lex.scanLabel(t);
					} else if (isDigit(t.charAt(0)) || (t.charAt(0) == '-' && isDigit(t.charAt(1)))) {
						lex.scanNumber(t);
					} else {
						aUnit.errep.reportError("expected operand after immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					}
					break;
				case "none":
					break;
				default:
					aUnit.errep.reportError("unrealistic expectation", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					break;
				}
			case "Relative":
				//operand is either an address, offset, or label deal with in sprint 3
				expected = lex.expect();
				t = nextToken(s);
				switch(expected) {
				case "number":
					if(isDigit(t.charAt(0)) || (t.charAt(0) == '-' && isDigit(t.charAt(1)))) {
						lex.scanNumber(t); //implied that this is an operand 
					} else {
						aUnit.errep.reportError("expected immediate data after an immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter()); 
					}
					break;
				case "label":
					if(isLetter(t.charAt(0))) {
						lex.scanLabel(t);
					} else {
						aUnit.errep.reportError("expected label after immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					}
					break;
				case "all": 
					if(isLetter(t.charAt(0))) {
						lex.scanLabel(t);
					} else if (isDigit(t.charAt(0)) || (t.charAt(0) == '-' && isDigit(t.charAt(1)))) {
						lex.scanNumber(t);
					} else {
						aUnit.errep.reportError("expected operand after immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					}
					break;
				case "none":
					break;
				default:
					aUnit.errep.reportError("unrealistic expectation", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					break;
				}
			}
			
		} else if(isLetter(s.charAt(0))) {
			label = true;
			String s0 = nextToken(s);
			lex.makeLabel(s0);
		} else if(s.charAt(0) == '.') {
			
		} else {
			aUnit.errep.reportError("expected line to start with tab or label", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
		}
		//next token that we get has to be an instruction or a directive, unless it's a comment.
		/*while(isSpace(s.charAt(aUnit.aUnit.currPos.getCharacter())) && s.charAt(aUnit.aUnit.currPos.getCharacter()) != ';') {
			aUnit.aUnit.currPos.incChar();
		}*/
		for(; aUnit.currPos.getCharacter() < s.length() - 1 && s.charAt(aUnit.currPos.getCharacter()) != ';' && !isSpace(s.charAt(aUnit.currPos.getCharacter())); aUnit.currPos.incChar()) {}
		if (label) {
			type = lex.scanIdentifier(nextToken(s));
			switch(type) {
			case "Inherent":
				//if inherent there is nothing left to scan
				break;
			case "Immediate":
				String expected = lex.expect(); //important that this is called before nextToken()
				String t = nextToken(s);
				switch(expected) {
				case "number":
					if(!isLetter(t.charAt(0))) {
						lex.scanNumber(t); //implied that this is an operand 
					} else {
						aUnit.errep.reportError("expected immediate data after an immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter()); 
					}
					break;
				case "label":
					if(isLetter(t.charAt(0))) {
						lex.scanLabel(t);
					} else {
						aUnit.errep.reportError("expected label after immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					}
					break;
				case "all": 
					if(isLetter(t.charAt(0))) {
						lex.scanLabel(t);
					} else if (isDigit(t.charAt(0)) || (t.charAt(0) == '-' && isDigit(t.charAt(1)))) {
						lex.scanNumber(t);
					} else {
						aUnit.errep.reportError("expected operand after immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					}
					break;
				case "none":
					break;
				default:
					aUnit.errep.reportError("unrealistic expectation", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					break;
				}
			case "Relative":
				expected = lex.expect();
				t = nextToken(s);
				switch(expected) {
				case "number":
					if(isDigit(t.charAt(0)) || (t.charAt(0) == '-' && isDigit(t.charAt(1)))) {
						lex.scanNumber(t); //implied that this is an operand 
					} else {
						aUnit.errep.reportError("expected immediate data after an immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter()); 
					}
					break;
				case "label":
					if(isLetter(t.charAt(0))) {
						lex.scanLabel(t);
					} else {
						aUnit.errep.reportError("expected label after immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					}
					break;
				case "all": 
					if(isLetter(t.charAt(0))) {
						lex.scanLabel(t);
					} else if (isDigit(t.charAt(0)) || (t.charAt(0) == '-' && isDigit(t.charAt(1)))) {
						lex.scanNumber(t);
					} else {
						aUnit.errep.reportError("expected operand after immediate instruction", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					}
					break;
				case "none":
					break;
				default:
					aUnit.errep.reportError("unrealistic expectation", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					break;
				} 
				break;
			}

		}
		aUnit.currPos.incLine();
		aUnit.currPos.clearChar();
	}
		//now that we've gotten the instruction we can know whether or not there should be an operand
		
		
	public String nextToken(String s) {
		int srcBegin = aUnit.currPos.getCharacter();
		int srcEnd = 0;
		char[] wordBuf = new char[s.length()];
		boolean inWord = false;
		for(;aUnit.currPos.getCharacter() < s.length() - 1; aUnit.currPos.incChar()) {
			if (s.charAt(aUnit.currPos.getCharacter()) == ';') {
				srcEnd = aUnit.currPos.getCharacter();
				String comm = s.substring(aUnit.currPos.getCharacter() + 1);
				lex.scanComment(comm);
				s.getChars(srcBegin, srcEnd, wordBuf, 0);
				tokenPos++;
				return Stringer(wordBuf).trim();
			}
			if(!isSpace(s.charAt(aUnit.currPos.getCharacter())) && !inWord) {
				inWord = true;
				srcBegin = aUnit.currPos.getCharacter();
			}
			if (isSpace(s.charAt(aUnit.currPos.getCharacter())) && inWord) {
				inWord = false;
				srcEnd = aUnit.currPos.getCharacter();
				break;
			}
		}
		if(srcEnd < srcBegin) {
			srcEnd = s.length() - 1;
		}
		s.getChars(srcBegin, srcEnd + 1, wordBuf, 0);
		tokenPos++;
		return Stringer(wordBuf).trim();
	}
		
	private String Stringer(char[] c) {
		return new String(c);
	}
	
	private boolean isSpace(int c) 
	{
		return (c == ' ' || c == '\t' || c == '\n');
	}
	
	private boolean isLetter(int c) {
		return (c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i' 
				|| c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q' 
				|| c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y' || c == 'z' 
				|| c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G' || c == 'H' || c == 'I'
				|| c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'O' || c == 'P' || c == 'Q' || c == 'R' 
				|| c == 'S' || c == 'T' || c == 'U' || c == 'V' || c == 'W' || c == 'X' || c == 'Y' || c == 'Z');
	}
	
	private boolean isDigit(int c) {
		return (c == '0' || c == '1'|| c == '2' || c == '3' || c == '4' || c == '5' || c == '6'
				|| c == '7' || c == '8' || c == '9');
	}
	
	
	
	
}
