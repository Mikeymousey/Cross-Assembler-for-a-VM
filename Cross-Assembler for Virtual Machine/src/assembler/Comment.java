package assembler;

public class Comment {
	private String comment;
	public Comment(String p) {
		comment = p;
	}
	public Comment() {
		this("");
	}
	
	public String toString() {
		return comment;
	}
}
