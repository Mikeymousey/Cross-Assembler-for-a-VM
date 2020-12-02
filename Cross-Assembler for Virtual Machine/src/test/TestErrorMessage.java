package test;

import assembler.*;

import assembler.ErrorMessage;
import assembler.Position;

public class TestErrorMessage {

    public static void main(String args[]) {

        Position p = new Position(1, 1);
        ErrorMessage m = new ErrorMessage("generic error", p);
        String message = m.printMessage();

        System.out.print("Test ErrorMessage: \n");
        System.out.print("generic error at line 1, character 1\n");
        System.out.print(message);
        System.out.println();


    }
}
