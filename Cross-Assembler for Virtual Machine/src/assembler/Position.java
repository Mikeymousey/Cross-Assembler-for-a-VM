package assembler;

public class Position {
	private int line = 0;
	private int character = 0;
	
	public Position(int l, int c) {
		line = l;
		character = c;
	}
	
	public Position() {
		this(0, 0);
	}

	public int getLine() {
		return line;
	}
	
	public int getCharacter() {
		return character;
	}
	
	public void incLine() {line++;}
	
	public void incChar() {character++;}
}