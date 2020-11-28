package test;
import java.io.IOException;
import assembler.*;

public class TestOperand {

	public static void main(String[] args) throws IOException{
		Operand op = new Operand();
		op.setValue(2);
		
		System.out.print("Test Operand\n");
	    System.out.print("This is the operand: 2\n");
	    System.out.print("This is the operand: " + op.getValue()); System.out.println();
	}
}
