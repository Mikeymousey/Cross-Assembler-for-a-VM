package assembler;

public class Mnemonic{
	public String identifier;
	public int opcode;
	public Mnemonic() {
		
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public int getOpcode() {
		return opcode;
	}
	public void setOpcode(String mnemonic) {
		opcode = SymbolTable.getOpcode(mnemonic);
	}
	public void setIdentifications(String str) {
		identifier = str;
		opcode = SymbolTable.getOpcode(str);
	}
}
