package assembler;

public class Instruction{
	private Mnemonic mnemonic;
	private Operand operand;
	private int Size;
	private int Address;
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public int getAddress() {
		return Address;
	}
	public void setAddress(int address) {
		Address = address;
	}
	public Instruction() {
		mnemonic = new Mnemonic();
		operand = new Operand();
	}
	public Mnemonic getMnemonic() {
		return mnemonic;
	}
	public void setMnemonic(Mnemonic mnemonic) {
		this.mnemonic = mnemonic;
	}
	public Operand getOperand() {
		return operand;
	}
	public void setOperand(Operand operand) {
		this.operand = operand;
	}
}
