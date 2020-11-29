package assembler;

public class Relative extends Instruction {
	private int rangeHigh;
	private int rangeLow;
	private Mnemonic mnemonic;
	private Operand operand;
	private int Size;
	public Relative () {
		mnemonic = new Mnemonic();
		operand = new Operand();
		Size = 2;
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
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	
	public void setRange(int l, int h) {
		rangeLow = l;
		rangeHigh = h;
	}
}
