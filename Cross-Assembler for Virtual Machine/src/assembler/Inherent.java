package assembler;

public class Inherent extends Instruction {
	private Mnemonic mnemonic;
	private Operand operand;
	private int opcode;
	public Inherent () {
		mnemonic = new Mnemonic();
		operand = new Operand();
	}

}
