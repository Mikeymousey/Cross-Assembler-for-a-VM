package assembler;

public class Inherent extends Instruction {

	private Mnemonic mnemonic;
	private Operand operand;
	private int Size;
	public Inherent () {
		mnemonic = new Mnemonic();
		operand = new Operand();
		Size = 0x02;
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
}
