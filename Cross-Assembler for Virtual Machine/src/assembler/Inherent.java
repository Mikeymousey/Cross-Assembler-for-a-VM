package assembler;

public class Inherent extends Instruction {

	private Mnemonic mnemonic;
	private Operand operand;
	private int size;
	public Inherent () {
		mnemonic = new Mnemonic();
		operand = new Operand();
		size = 1;
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
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
