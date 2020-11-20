package assembler;

public class Mnemonic{
	public String identifier;
	public String opcode;
	public Mnemonic() {
		
	}
	public String getIdentifier() {
		return identifier;
	}
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}
	public String getOpcode() {
		return opcode;
	}
	public void setOpcode(String mnemonic) {
		opcode = SymbolTable.getHexOpcode(mnemonic);
	}
	public void setIdentifications(String str) {
		identifier = str;
		opcode = SymbolTable.getHexOpcode(str);
	}
}
