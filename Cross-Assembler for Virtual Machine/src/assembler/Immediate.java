package assembler;

public class Immediate extends Instruction {
	private int rangeHigh;
	private int rangeLow;
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
	public Immediate() {
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
	
	@Override public void setOperand(Operand operand) {
		this.operand = operand;
		mnemonic.addOperand(operand.getValue());
	}
	
	public void setRange(int l, int h) {
		rangeHigh = h;
		rangeLow = l;
	}
	
	@Override public boolean inRange(int n) {
		if(n < rangeLow || n > rangeHigh) {
			return false;
		} else {
			return true;
		}
	}
}
