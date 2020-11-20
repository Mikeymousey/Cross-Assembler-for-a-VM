package assembler;

public class Lexicalanalyzer 
{
	public AssemblyUnit aUnit;
	//Constructor
	public Lexicalanalyzer(AssemblyUnit aUnit) 
	{
		this.aUnit = aUnit;
	}
	public void Parse(char[] linestatement) 
	{
		String token = new String(linestatement);		
				switch(token) 
				{
//---------------------------------------------------------------------------- INSTRUCTION FORMAT ---------------------------------------------------------------------------------------//

//------------------------------------------------------------------------------ INHERENT ---------------------------------------------------------------------------------------//
				case "halt":
					SetLine("halt");
					break;
				case "pop":
					SetLine("pop");
					break;
				case "dup":
					SetLine("dup");
					break;
				case "exit":
					SetLine("exit");
					break;
				case "ret":
					SetLine("ret");
					break;
				case "not":
					SetLine("not");
					break;
				case "and":
					SetLine("and");
					break;
				case "or":
					SetLine("or");
					break;
				case "xor":
					SetLine("xor");
					break;
				case "neg":
					SetLine("neg");
					break;
				case "inc":
					SetLine("inc");
					break;
				case "dec":
					SetLine("dec");
					break;
				case "add":
					SetLine("add");
					break;
				case "sub":
					SetLine("sub");
					break;
				case "mul":
					SetLine("mul");
					break;
				case "div":
					SetLine("div");
					break;
				case "rem":
					SetLine("rem");
					break;
				case "shl":
					SetLine("shl");
					break;
				case "shr":
					SetLine("shr");
					break;
				case "teq":
					SetLine("teq");
					break;
				case "tne":
					SetLine("tne");
					break;
				case "tlt":
					SetLine("tlt");
					break;
				case "tgt":
					SetLine("tgt");
					break;
				case "tle":
					SetLine("tle");
					break;
				case "tge":
					SetLine("tge");
					break;
//-------------------------------------------------------------------------------- INHERENT ---------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------- IMMEDIATE ---------------------------------------------------------------------------------------//

				case "br.i5":
					SetLine("br.i5");
					break;
				case "brf.l5":
					SetLine("brf.l5");
					break;
				case "enter.u5":
					SetLine("enter.u5");
					break;
				case "ldc.i3":
					SetLine("ldc.i3");
					break;
				case "addv.u3":
					SetLine("addv.u3");
					break;
				case "ldv.u3":
					SetLine("ldv.u3");
					break;
				case "stv.u3":
					SetLine("stv.u3");
					break;
//-------------------------------------------------------------------------------- IMMEDIATE ---------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------- RELATIVE ---------------------------------------------------------------------------------------//
				case "addv.u8":
					SetLine("addv.u8");
					break;
				case "ldv.u8":
					SetLine("ldv.u8");
					break;
				case "stv.u8":
					SetLine("stv.u8");
					break;
				case "incv.u8":
					SetLine("incv.u8");
					break;
				case "enter.u8":
					SetLine("enter.u8");
					break;
				case "lda.il6":
					SetLine("lda.il6");
					break;
				case "ldc.i8":
					SetLine("ldc.i8");
					break;
				case "ldc.il6":
					SetLine("ldc.il6");
					break;
				case "ldc.i32":
					SetLine("ldc.i32");
					break;
				case "br.i8":
					SetLine("br.i8");
					break;
				case "br.il6":
					SetLine("br.il6");
					break;
				case "brf.i8":
					SetLine("brf.i8");
					break;
				case "call.il6":
					SetLine("call.il6");
					break;
				case "trap":
					SetLine("trap");
					break;
				default:
					aUnit.errep.reportError("unrecognized mnemonic", aUnit.currPos);
				}//end of switch
	}//end of Parse method
	private void SetLine(String instruction) {
		aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().getMnemonic().setIdentifications(instruction);
		System.out.println("Line "+aUnit.currPos.getLine()+". Mnemonic identifier: "+aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().getMnemonic().getIdentifier());
		System.out.println("Line "+aUnit.currPos.getLine()+". Mnemonic opcode: "+ aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().getMnemonic().getOpcode());
	}
}
