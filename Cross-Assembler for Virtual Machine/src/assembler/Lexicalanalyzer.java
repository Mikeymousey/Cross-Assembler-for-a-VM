package assembler;

public class Lexicalanalyzer 
{
	public AssemblyUnit aUnit;
	private String expected = "none";
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
					expected = "none";
					return "Inherent";
				case "pop":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("pop");
					expected = "none";
					return "Inherent";
				case "dup":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("dup");
					expected = "none";
					return "Inherent";
				case "exit":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("exit");
					expected = "none";
					return "Inherent";
				case "ret":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("ret");
					expected = "none";
					return "Inherent";
				case "not":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("not");
					expected = "none";
					return "Inherent";
				case "and":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("and");
					expected = "none";
					return "Inherent";
				case "or":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("or");
					expected = "none";
					return "Inherent";
				case "xor":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("xor");
					expected = "none";
					return "Inherent";
				case "neg":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("neg");
					expected = "none";
					break;
				case "inc":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("inc");
					expected = "none";
					break;
				case "dec":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("dec");
					expected = "none";
					break;
				case "add":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("add");
					expected = "none";
					break;
				case "sub":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("sub");
					expected = "none";
					break;
				case "mul":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("mul");
					expected = "none";
					break;
				case "div":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("div");
					expected = "none";
					break;
				case "rem":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("rem");
					expected = "none";
					return "Inherent";
				case "shl":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("shl");
					expected = "none";
					return "Inherent";
				case "shr":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("shr");
					expected = "none";
					return "Inherent";
				case "teq":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("teq");
					expected = "none";
					return "Inherent";
				case "tne":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tne");
					expected = "none";
					return "Inherent";
				case "tlt":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tlt");
					expected = "none";
					return "Inherent";
				case "tgt":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tgt");
					expected = "none";
					return "Inherent";
				case "tle":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tle");
					expected = "none";
					return "Inherent";
				case "tge":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Inherent());
					SetLine("tge");
					expected = "none";
					return "Inherent";
//-------------------------------------------------------------------------------- INHERENT ---------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------- IMMEDIATE ---------------------------------------------------------------------------------------//

				case "br.i5": //takes a label
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Immediate());
					SetLine("br.i5");
					expected = "label";
					return "Immediate";
				case "brf.15": //takes a label 
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Immediate());
					SetLine("brf.15");
					expected = "label";
					return "Immediate";
				case "enter.u5"://takes FctInfo ??
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Immediate());
					SetLine("enter.u5");
					expected = "label";
					return "Immediate";
				case "ldc.i3": //takes number
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Immediate());
					SetLine("ldc.i3");
					((Immediate) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(-4, 3);
					expected = "number";
					return "Immediate";
				case "addv.u3":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Immediate());	
					SetLine("addv.u3");
					((Immediate) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(0, 7);
					expected = "number";
					return "Immediate";
				case "ldv.u3":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Immediate());
					SetLine("ldv.u3");
					((Immediate) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(0, 7);
					expected = "number";
					return "Immediate";
				case "stv.u3":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Immediate());
					SetLine("stv.u3");
					((Immediate) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(0, 7);
					expected = "number";
					return "Immediate";
//-------------------------------------------------------------------------------- IMMEDIATE ---------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------- RELATIVE ---------------------------------------------------------------------------------------//
				case "addv.u8":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(2);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(0, 255);
					SetLine("addv.u8");
					return "Relative";
				case "ldv.u8":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(2);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(0, 255);
					SetLine("ldv.u8");
					return "Relative";
				case "stv.u8":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(2);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(0, 255);
					SetLine("stv.u8");
					return "Relative";
				case "incv.u8":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(2);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(0, 255);
					SetLine("incv.u8");
					return "Relative";
				case "enter.u8":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(2);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(0, 255);
					SetLine("enter.u8");
					return "Relative";
				case "lda.il6":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(3);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(-32768, 32767);
					SetLine("lda.il6");
					return "Relative";
				case "ldc.i8":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(2);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(-128, 127);
					SetLine("ldc.i8");
					return "Relative";
				case "ldc.il6":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(3);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(-32768, 32767);
					SetLine("ldc.il6");
					return "Relative";
				case "ldc.i32":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(5);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(-2147483648, 2147483647);
					SetLine("ldc.i32");
					return "Relative";
				case "br.i8":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(2);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(-128, 127);
					SetLine("br.i8");
					return "Relative";
				case "br.il6":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(3);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(-32768, 23767);
					SetLine("br.il6");
					return "Relative";
				case "brf.i8":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(2);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(-128, 127);
					SetLine("brf.i8");
					return "Relative";
				case "call.il6":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(3);
					((Relative) aUnit.asmFile[aUnit.currPos.getLine()].getInstruction()).setRange(-32768, 32767);
					SetLine("call.il6");
					return "Relative";
				case "trap":
					aUnit.asmFile[aUnit.currPos.getLine()].setInstruction(new Relative());
					aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setSize(2);
					SetLine("trap");
					return "Relative";
				default:
					aUnit.errep.reportError("unrecognized mnemonic", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
					return "Error";
				}//end of switch
				return "?";
	}//end of Parse method
	public void scanDirective() {
		String c;
	}
	public void makeLabel(String token) {
		if(SymbolTable.getOpcode(token) == -1) {
			aUnit.asmFile[aUnit.currPos.getLine()].setLabel(new Label(token));
			Node n = new Node(token, aUnit.address);
			SymbolTable.addNode(n);
		} else {
			aUnit.errep.reportError("Label already exists", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
		}
	}
	public void scanLabel(String token) {
		if(SymbolTable.getOpcode(token) != -1) {
			scanNumber(SymbolTable.getOpcode(token));
		} else {
			aUnit.errep.reportError("Unrecognized label", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
		}
	}
	public void scanComment(String comm) {
		System.out.println("comment recieved: " + comm);
		aUnit.asmFile[aUnit.currPos.getLine()].setComment(new Comment(comm));
	}
	public void scanNumber(String n) {
		int op = Integer.parseInt(n);
		if(aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().inRange(op)) {
			aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setOperand(new Operand(op));
		} else {
			aUnit.errep.reportError("Operand out of range", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
		}
	}
	public void scanNumber(int n) {
		if(aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().inRange(n)) {
			aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().setOperand(new Operand(n));
		} else {
			aUnit.errep.reportError("Operand out of range", aUnit.currPos.getLine(), aUnit.currPos.getCharacter());
		}
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
		aUnit.address += aUnit.asmFile[aUnit.currPos.getLine()].getInstruction().getSize();
	}
	
	public String expect() {
		return expected;
	}
}
