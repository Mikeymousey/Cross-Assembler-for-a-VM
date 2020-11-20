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
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("halt");
					break;
				case "pop":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("pop");
					break;
				case "dup":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("dup");
					break;
				case "exit":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("exit");
					break;
				case "ret":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("ret");
					break;
				case "not":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("not");
					break;
				case "and":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("and");
					break;
				case "or":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("or");
					break;
				case "xor":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("xor");
					break;
				case "neg":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("neg");
					break;
				case "inc":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("inc");
					break;
				case "dec":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("dec");
					break;
				case "add":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("add");
					break;
				case "sub":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("sub");
					break;
				case "mul":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("mul");
					break;
				case "div":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("div");
					break;
				case "rem":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("rem");
					break;
				case "shl":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("shl");
					break;
				case "shr":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("shr");
					break;
				case "teq":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("teq");
					break;
				case "tne":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tne");
					break;
				case "tlt":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tlt");
					break;
				case "tgt":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tgt");
					break;
				case "tle":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tle");
					break;
				case "tge":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
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
		aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setAddress(aUnit.address);
		incAddress();
		System.out.println("Line "+aUnit.currPos.getLine()+". Mnemonic identifier: "+aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().getMnemonic().getIdentifier());
		System.out.printf("Line "+aUnit.currPos.getLine()+". Machine Code: "+ "%02X",aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().getMnemonic().getOpcode());
		System.out.println("");
	}
	public void incAddress() {
		aUnit.address += 1;
	}
}
