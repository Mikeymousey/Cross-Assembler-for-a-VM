package assembler;

public class Operand {
	private int operand;
	public Operand(int p) {
		operand = p;
	}
	
	public Operand() {
		operand = 0;
	}
	
	public void setValue(int a) {
		operand = a;
	}
	
	public int getValue() {
		return operand;
	}
	
	public String toString() {
		return "This is the operand";
	}
}
