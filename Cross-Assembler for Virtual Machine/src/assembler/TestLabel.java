package assembler;
import java.io.IOException;

public class TestLabel {

	static Label l1 = new Label("push");
    public static void main(String[] args) throws IOException {
        
        System.out.print("Test Label\n");
        System.out.print("push");
        System.out.print(l1.toString());
    }
}
