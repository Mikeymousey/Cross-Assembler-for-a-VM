package assembler;


public class Label extends Operand {
	private String identifier;
	public Label (String q) {
		identifier = q; 
	}
	
	public Label() {
		this("");
	}
	
	public String getLabelName() {
		return identifier;
	}
	
	public String toString() {
		return identifier;
	}

}
