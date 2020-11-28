package assembler;

public class ErrorMessage {
	private String message;
	private Position pos; 
	
	public ErrorMessage(String m, Position p) {
		message = m;
		pos = p;
	}
	
	public String printMessage() {
		return message + " at line " + pos.getLine() + ", character " + pos.getCharacter();
		
	}
}

