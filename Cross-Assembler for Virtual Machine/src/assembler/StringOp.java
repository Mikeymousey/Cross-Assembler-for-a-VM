package assembler;

public class StringOp extends Operand {
	private String s;
	public StringOp(String s) {
		this.s = s; 
	}
	
	public StringOp() {
		this("");
	}
	
	public String toString() {
		return s;
	}



}
