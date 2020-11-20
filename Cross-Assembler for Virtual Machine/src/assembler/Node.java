package assembler;

public class Node {
	private String identifier;
	private String machine;
	
	public Node(String s, int h) {
		identifier = s;
		machine = Integer.toString(h, 16);
	}
	
	public String getNodeIdentifier() {
		return identifier;
	}
	
	public String getNodeHex() {
		return machine;
	}
}
