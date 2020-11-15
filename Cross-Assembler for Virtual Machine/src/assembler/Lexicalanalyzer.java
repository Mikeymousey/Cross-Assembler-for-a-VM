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
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "add";
					break;
				case "addv":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "addv";
					break;
				case "and":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "and";
					break;
				case "br":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "br";
					break;
				case "brf":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "brf";
					break;
				case "call":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "call";
					break;
				case "dec":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "decv";
					break;
				case "div":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "div";
					break;
				case "dup":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "dup";
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().setOpcode(symbolTable.getSymbol(lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier));//assigns the correct hex value to instruction
					System.out.println("Line "+currPos.getLine()+". Mnemonic identifier: "+lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier);
					System.out.println("Line "+currPos.getLine()+". Mnemonic opcode: "+(lineStatements[currPos.getLine()].getInstruction().getMnemonic().getOpcode()));
					break;
				case "enter":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "enter";
					break;
				case "halt":
					//lineStatements[currPos.getLine()].setInstruction(new Inherent()); //creates type of instruction
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "halt";//Assigns identifier to instruction
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().setOpcode(symbolTable.getSymbol(lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier));//assigns the correct hex value to instruction
					System.out.println("Line "+currPos.getLine()+". Mnemonic identifier: "+lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier);
					System.out.println("Line "+currPos.getLine()+". Mnemonic opcode: "+(lineStatements[currPos.getLine()].getInstruction().getMnemonic().getOpcode()));
					break;
				case "inc":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "inc";
					System.out.println("Line "+currPos.getLine()+". Mnemonic identifier: "+lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier);
					break;
				case "incv":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "incv";
					System.out.println("Line "+currPos.getLine()+". Mnemonic identifier: "+lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier);
					break;
					//---------------------------------------------------------------------- OPCODES 2.0 ---------------------------------------------------------------------------------------//
				case "ldc":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "ldc";
					System.out.println("Line "+currPos.getLine()+". Mnemonic identifier: "+lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier);
					break;
				case "ldv":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "ldv";
					break;
				case "mul":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "mul";
					break;
				case "neg":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "neg";
					break;
				case "not":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "not";
					System.out.println("This is the number being returned: "+symbolTable.getSymbol(lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier));
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().setOpcode(symbolTable.getSymbol(lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier));//assigns the correct hex value to instruction
					System.out.println("Line "+currPos.getLine()+". Mnemonic identifier: "+lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier);
					System.out.println("Line "+currPos.getLine()+". Mnemonic opcode: "+Integer.toString(lineStatements[currPos.getLine()].getInstruction().getMnemonic().getOpcode(), 16));
					break;
				case "or":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "or";
					break;
				case "pop":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "pop";
					System.out.println("Line "+currPos.getLine()+". Mnemonic identifier: "+lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier);
					break;
				case "rem":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "rem";
					break;
				case "ret":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "ret";
					break;
				case "shl":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "shl";
					break;
				case "shr":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "shr";
					break;
				case "sub":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "sub";
					break;
				case "stv":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "stv";
					break;
				case "teq":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "teq";
					break;
				case "tge":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "tge";
					break;
				case "tgt":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "tgt";
					break;
				case "tle":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "tle";
					break;
				case "tlt":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "tlt";
					break;
				case "tne":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "tne";
					break;
				case "trap":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "trap";
					break;
				case "xor":
					lineStatements[currPos.getLine()].getInstruction().getMnemonic().identifier = "xor";
					break;
			//---------------------------------------------------------------------- OPCODES 2.0 ---------------------------------------------------------------------------------------//
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

}
