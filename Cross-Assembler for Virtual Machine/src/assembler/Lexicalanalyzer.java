package assembler;

public class Lexicalanalyzer 
{
	public AssemblyUnit aUnit;
	//Constructor
	public Lexicalanalyzer(AssemblyUnit aUnit) 
	{
		this.aUnit = aUnit;
	}
	public String scanIdentifier(String token) 
	{		
				System.out.println("identifier recieved: " + token + " of length: " + token.length());
				switch(token) 
				{
//---------------------------------------------------------------------------- INSTRUCTION FORMAT ---------------------------------------------------------------------------------------//

//------------------------------------------------------------------------------ INHERENT ---------------------------------------------------------------------------------------//
				case "halt":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("halt");
					return "Inherent";
				case "pop":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("pop");
					return "Inherent";
				case "dup":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("dup");
					return "Inherent";
				case "exit":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("exit");
					return "Inherent";
				case "ret":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("ret");
					return "Inherent";
				case "not":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("not");
					return "Inherent";
				case "and":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("and");
					return "Inherent";
				case "or":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("or");
					return "Inherent";
				case "xor":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("xor");
					return "Inherent";
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
					return "Inherent";
				case "shl":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("shl");
					return "Inherent";
				case "shr":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("shr");
					return "Inherent";
				case "teq":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("teq");
					return "Inherent";
				case "tne":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tne");
					return "Inherent";
				case "tlt":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tlt");
					return "Inherent";
				case "tgt":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tgt");
					return "Inherent";
				case "tle":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tle");
					return "Inherent";
				case "tge":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tge");
					return "Inherent";
//-------------------------------------------------------------------------------- INHERENT ---------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------- IMMEDIATE ---------------------------------------------------------------------------------------//

				case "br.i5":
					//aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Immediate());
					SetLine("br.i5");
					return "Immediate";
				case "brf.l5":
					SetLine("brf.l5");
					return "Immediate";
				case "enter.u5":
					SetLine("enter.u5");
					return "Immediate";
				case "ldc.i3":
					SetLine("ldc.i3");
					return "Immediate";
				case "addv.u3":
					SetLine("addv.u3");
					return "Immediate";
				case "ldv.u3":
					SetLine("ldv.u3");
					return "Immediate";
				case "stv.u3":
					SetLine("stv.u3");
					return "Immediate";
//-------------------------------------------------------------------------------- IMMEDIATE ---------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------- RELATIVE ---------------------------------------------------------------------------------------//
				case "addv.u8":
					SetLine("addv.u8");
					return "Relative";
				case "ldv.u8":
					SetLine("ldv.u8");
					return "Relative";
				case "stv.u8":
					SetLine("stv.u8");
					return "Relative";
				case "incv.u8":
					SetLine("incv.u8");
					return "Relative";
				case "enter.u8":
					SetLine("enter.u8");
					return "Relative";
				case "lda.il6":
					SetLine("lda.il6");
					return "Relative";
				case "ldc.i8":
					SetLine("ldc.i8");
					return "Relative";
				case "ldc.il6":
					SetLine("ldc.il6");
					return "Relative";
				case "ldc.i32":
					SetLine("ldc.i32");
					return "Relative";
				case "br.i8":
					SetLine("br.i8");
					return "Relative";
				case "br.il6":
					SetLine("br.il6");
					return "Relative";
				case "brf.i8":
					SetLine("brf.i8");
					return "Relative";
				case "call.il6":
					SetLine("call.il6");
					return "Relative";
				case "trap":
					SetLine("trap");
					return "Relative";
				default:
					aUnit.errep.reportError("unrecognized mnemonic", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					return "Error";
				}//end of switch
				return "?";
	}//end of Parse method
	public void scanLabel(String token) {
		aUnit.asmFile[aUnit.currPos.getLine()].setLabel(new Label(token));
		Node n = new Node(token, aUnit.address);
		SymbolTable.addNode(n);
	}
	public void scanComment(String comm) {
		System.out.println("comment recieved: " + comm);
		aUnit.asmFile[aUnit.currPos.getLine()].setComment(new Comment(comm));
	}
	public void scanNumber(String n) {
		aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setOperand(new Operand(Integer.parseInt(n)));
	}
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
