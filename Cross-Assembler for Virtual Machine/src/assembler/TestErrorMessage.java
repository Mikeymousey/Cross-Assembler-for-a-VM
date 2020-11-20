package assembler;

public class TestErrorMessage {
	static Position p = new Position (1, 1);
	static ErrorMessage m = new ErrorMessage("generic error", p);
	public static void main(String args[]) {
		
		System.out.print("Test ErrorMessage: <2\n");
		System.out.print("generic error\n");
		System.out.print("at line 1, character 1\n");
		m.printMessage();
	}
}
