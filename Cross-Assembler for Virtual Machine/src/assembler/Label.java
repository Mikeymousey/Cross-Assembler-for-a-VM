package assembler;


public class Label extends Operand {
	private String identifier;
	public Label() {
		
	}
	public Label (String id) {
		identifier=id;
	}

}
