package assembler;
import java.io.IOException;

public class TestOperand {

	public static void main(String[] args) throws IOException{
		Operand op = new Operand();
		op.setValue(2);
		
		System.out.print("Test Operand\n");
	    System.out.print("This is the operand , 2");
	    System.out.print(op.toString() + " " + op.getValue());
	}
}
