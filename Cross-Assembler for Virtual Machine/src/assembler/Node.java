package assembler;

public class Node {
	private String identifier;
	private int machine;
	
	public Node(String s, int h) {
		identifier = s;
		machine = h;
	}
	
	public String getNodeIdentifier() {
		return identifier;
	}
	
	public int getNodeHex() {
		return machine;
	}
}
