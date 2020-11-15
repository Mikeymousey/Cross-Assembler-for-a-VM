package assembler;

public class Mnemonic{
	public String identifier;
	public int opcode;
	public Mnemonic() {
		
	}
	public int getOpcode() {
		return opcode;
	}
	public void setOpcode(int opCode) {
		this.opcode = opCode;
	}
}
