package test;
import java.io.*;
import assembler.*;


public class TestPosition {
    

    public static void main(String[] args) throws IOException {

        Position p1 = new Position (1,1);
      
        System.out.print("Test Position\n");
        System.out.print("p1[1,1]\n"); //expected output
        System.out.print("p1["+ p1.getLine() + "," + p1.getCharacter()+"]"); //actual output
        System.out.println();
    }

}
