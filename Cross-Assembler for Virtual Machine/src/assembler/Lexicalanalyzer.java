package assembler;

import java.util.ArrayList;

public class Lexicalanalyzer 
{
	Linestatement[] lineStatements;
	public Lexicalanalyzer(int numOfLines) 
	{
		lineStatements = new Linestatement[numOfLines];
	}
	public void Parse(String linestatement) 
	{
		String[] strArray = linestatement.split(" ");
		for(int i = 0; i<lineStatements.length; i++) 
		{
			for(int j = 0; j<strArray.length; j++) 
			{
				switch(strArray[j]) 
				{
		//---------------------------------------------------------------------- INSTRUCTION FORMAT ---------------------------------------------------------------------------------------//

			//---------------------------------------------------------------------- OPCODES ---------------------------------------------------------------------------------------//
				case "add":
					lineStatements[i].getInstruction().getMnemonic().identifier = "add";
					break;
				case "addv":
					lineStatements[i].getInstruction().getMnemonic().identifier = "addv";
					break;
				case "and":
					lineStatements[i].getInstruction().getMnemonic().identifier = "and";
					break;
				case "br":
					lineStatements[i].getInstruction().getMnemonic().identifier = "br";
					break;
				case "brf":
					lineStatements[i].getInstruction().getMnemonic().identifier = "brf";
					break;
				case "call":
					lineStatements[i].getInstruction().getMnemonic().identifier = "call";
					break;
				case "dec":
					lineStatements[i].getInstruction().getMnemonic().identifier = "decv";
					break;
				case "div":
					lineStatements[i].getInstruction().getMnemonic().identifier = "div";
					break;
				case "dup":
					lineStatements[i].getInstruction().getMnemonic().identifier = "dup";
					break;
				case "enter":
					lineStatements[i].getInstruction().getMnemonic().identifier = "enter";
					break;
				case "halt":
					lineStatements[i].getInstruction().getMnemonic().identifier = "halt";
					break;
				case "inc":
					lineStatements[i].getInstruction().getMnemonic().identifier = "inc";
					break;
				case "incv":
					lineStatements[i].getInstruction().getMnemonic().identifier = "incv";
					break;
					//---------------------------------------------------------------------- OPCODES 2.0 ---------------------------------------------------------------------------------------//
				case "ldc":
					lineStatements[i].getInstruction().getMnemonic().identifier = "ldc";
					break;
				case "ldv":
					lineStatements[i].getInstruction().getMnemonic().identifier = "ldv";
					break;
				case "mul":
					lineStatements[i].getInstruction().getMnemonic().identifier = "mul";
					break;
				case "neg":
					lineStatements[i].getInstruction().getMnemonic().identifier = "neg";
					break;
				case "not":
					lineStatements[i].getInstruction().getMnemonic().identifier = "not";
					break;
				case "or":
					lineStatements[i].getInstruction().getMnemonic().identifier = "or";
					break;
				case "pop":
					lineStatements[i].getInstruction().getMnemonic().identifier = "pop";
					break;
				case "rem":
					lineStatements[i].getInstruction().getMnemonic().identifier = "rem";
					break;
				case "ret":
					lineStatements[i].getInstruction().getMnemonic().identifier = "ret";
					break;
				case "shl":
					lineStatements[i].getInstruction().getMnemonic().identifier = "shl";
					break;
				case "shr":
					lineStatements[i].getInstruction().getMnemonic().identifier = "shr";
					break;
				case "sub":
					lineStatements[i].getInstruction().getMnemonic().identifier = "sub";
					break;
				case "stv":
					lineStatements[i].getInstruction().getMnemonic().identifier = "stv";
					break;
				case "teq":
					lineStatements[i].getInstruction().getMnemonic().identifier = "teq";
					break;
				case "tge":
					lineStatements[i].getInstruction().getMnemonic().identifier = "tge";
					break;
				case "tgt":
					lineStatements[i].getInstruction().getMnemonic().identifier = "tgt";
					break;
				case "tle":
					lineStatements[i].getInstruction().getMnemonic().identifier = "tle";
					break;
				case "tlt":
					lineStatements[i].getInstruction().getMnemonic().identifier = "tlt";
					break;
				case "tne":
					lineStatements[i].getInstruction().getMnemonic().identifier = "tne";
					break;
				case "trap":
					lineStatements[i].getInstruction().getMnemonic().identifier = "trap";
					break;
				case "xor":
					lineStatements[i].getInstruction().getMnemonic().identifier = "xor";
					break;
			//---------------------------------------------------------------------- OPCODES 2.0 ---------------------------------------------------------------------------------------//
				case "<i>":
					lineStatements[i].getInstruction().getMnemonic().identifier = "xor";
					break;
				case "<u>":
					lineStatements[i].getInstruction().getMnemonic().identifier = "xor";
					break;
				case "<v>":
					lineStatements[i].getInstruction().getMnemonic().identifier = "xor";
					break;
				case "<n>":
					lineStatements[i].getInstruction().getMnemonic().identifier = "xor";
					break;
				case "<a>":
					lineStatements[i].getInstruction().getMnemonic().identifier = "xor";
					break;
				
				}//end of switch
			}//end of line split for loop
		}//end of line statement for loop
	}//end of Parse method

}
