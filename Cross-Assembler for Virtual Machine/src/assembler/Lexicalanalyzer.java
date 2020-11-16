package assembler;

import java.io.IOException;
import java.util.ArrayList;

public class Lexicalanalyzer 
{
	private int numberOfLines;
	private Position currPos;
	private ErrorReporter errep;
	private SymbolTable symbolTable;
	private int instruction = 0;
	Linestatement[] lineStatements; //Instruction set
	//Constructor
	public Lexicalanalyzer(int numOfLines) 
	{
		symbolTable = new SymbolTable();
		currPos = new Position(0, 0);
		errep = new ErrorReporter();
		lineStatements = new Linestatement[numOfLines];
		numberOfLines = numOfLines;
		lineStatements = new Linestatement[numOfLines]; //Creating array
		for(int i = 0; i<lineStatements.length; i++) //Create instances
			lineStatements[i] = new Linestatement();
	}
	public void Parse(char[] linestatement) 
	{
		String token = new String(linestatement);		
				switch(token) 
				{
		//---------------------------------------------------------------------- INSTRUCTION FORMAT ---------------------------------------------------------------------------------------//

			//---------------------------------------------------------------------- INHERENT ---------------------------------------------------------------------------------------//
				case "add":
					setLine("add");
					break;
				case "addv":
					setLine("addv");
					break;
				case "and":
					setLine("and");
					break;
				case "br":
					setLine("br");
					break;
				case "brf":
					setLine("brf");
					break;
				case "call":
					setLine("call");
					break;
				case "dec":
					setLine("dec");
					break;
				case "div":
					setLine("div");
					break;
				case "dup":
					setLine("dup");
					break;
				case "enter":
					setLine("enter");
					break;
				case "halt":
					setLine("halt");
					break;
				case "inc":
					setLine("inc");
					break;
				case "incv":
					setLine("incv");
					break;
					//---------------------------------------------------------------------- OPCODES 2.0 ---------------------------------------------------------------------------------------//
				case "ldc":
					setLine("ldc");
					break;
				case "ldv":
					setLine("ldv");
					break;
				case "mul":
					setLine("mul");
					break;
				case "neg":
					setLine("neg");
					break;
				case "not":
					setLine("not");
					break;
				case "or":
					setLine("or");
					break;
				case "pop":
					setLine("pop");
					break;
				case "rem":
					setLine("rem");
					break;
				case "ret":
					setLine("ret");
					break;
				case "shl":
					setLine("shl");
					break;
				case "shr":
					setLine("shr");
					break;
				case "sub":
					setLine("sub");
					break;
				case "stv":
					setLine("stv");
					break;
				case "teq":
					setLine("teq");
					break;
				case "tge":
					setLine("tge");
					break;
				case "tgt":
					setLine("tgt");
					break;
				case "tle":
					setLine("tle");
					break;
				case "tlt":
					setLine("tlt");
					break;
				case "tne":
					setLine("tne");
					break;
				case "trap":
					setLine("trap");
					break;
				case "xor":
					setLine("xor");
					break;
			//---------------------------------------------------------------------- OPCODES 2.0 ---------------------------------------------------------------------------------------//
				//didn't change, not in use for now
				case "<i>":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "xor";
					break;
				case "<u>":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "xor";
					break;
				case "<v>":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "xor";
					break;
				case "<n>":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "xor";
					break;
				case "<a>":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "xor";
					break;
				default:
					errep.reportError("unrecognized mnemonic", currPos);
				}//end of switch
	}//end of Parse method
	
	
	private boolean isSpace(int c) {
		return (c == ' ' || c == '\t' || c == '\n');
	}
	
	public void readLine(String s) throws IOException {
		String str = s.trim();
		int stringLength = str.length();
		char[] wordBuf = new char[str.length()];
		int inWordCnt = 0;
		for(int i = 0; i < str.length()+1; i++) {
			if(i<str.length()) {
			if(!isSpace(str.charAt(i))) {//for anything that isn't whitespace put it in a word buffer
				wordBuf[inWordCnt] = str.charAt(i);
				inWordCnt++;
			} else if (inWordCnt > 0){
				Parse(wordBuf);//send any sequence of non white-space characters to the Parse function
				inWordCnt = 0;
			}
			}else {
				Parse(wordBuf);
			}
			currPos.incChar();
		}
		currPos.incLine();
	}
	
	//add a private method to simply the code above
	private void setLine(String instruction) {
		lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = instruction;
		lineStatements[currPos.getLine()].getInstruction().getMnemonic().setOpcode(symbolTable.getSymbol(lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier));//assigns the correct hex value to instruction
		//System.out.println("Line "+currPos.getLine()+". Mnemonic identifier: "+lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier);
		//System.out.println("Line "+currPos.getLine()+". Mnemonic opcode: "+Integer.toString(lineStatements[currPos.getLine()].getInstruction().getMnemonic().getOpcode(), 16));
	}
	
	public void outOpcodes() {
		for (int i = 0; i < numberOfLines; i++) {
			System.out.println(Integer.toString(lineStatements[i].getInstruction().getMnemonic().getOpcode(), 16));
		}
	}
	
}
