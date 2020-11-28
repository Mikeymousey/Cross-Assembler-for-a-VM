package test;

import assembler.ErrorMessage;
import assembler.ErrorReporter;
import assembler.Position;

public class TestErrorReporter {
	static ErrorReporter errep = new ErrorReporter();
	static Position p0 = new Position(1, 1);
	static ErrorMessage m0 = new ErrorMessage("first error message", p0);
	//static Position p1 = new Position(2, 2);
	//static ErrorMessage m1 = new ErrorMessage("second error message", p0);
		public static void main(String args[]) {
			
			System.out.print("Test ErrorReporter: \n");
			System.out.print("first error message\n");
			System.out.print("at line 1, character 1\n");
			System.out.print("second error message\n");
			System.out.print("at line 2, character 2\n");
			errep.reportError(m0);
			errep.reportError("second error message", 2, 2);
			errep.printErrors();
		}
}
