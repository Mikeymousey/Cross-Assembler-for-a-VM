package assembler;

public class Operand {
	private int operand;
	public Operand(int p) {
		operand = p;
	}
	
	public Operand() {
		this(420);
	}
	
	public void setValue(int a) {
		operand = a;
	}
	
	public int getValue() {
		return operand;
	}
	
	public String toString() {
		if(operand != 420) {
			return Integer.toString(operand);
		} else {
			return "";
		}
	}
}
