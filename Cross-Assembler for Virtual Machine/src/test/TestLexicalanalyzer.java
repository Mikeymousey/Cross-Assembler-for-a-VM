package test;
import assembler.*;
import java.io.*;



public class TestLexicalanalyzer {

    public static void main(String[] args) throws IOException {


        Lexicalanalyzer lexer;
        AssemblyUnit aUnit;
    
        aUnit = new AssemblyUnit("Instruction_Test.asm");
        lexer = new Lexicalanalyzer(aUnit);
       
        

        String tokentest = "halt";
        aUnit.asmFile = new Linestatement[1];
        aUnit.currPos = new Position(0,0);
        aUnit.asmFile[0] = new Linestatement();
      





        
        String lextest = lexer.scanIdentifier(tokentest);

     


        System.out.print("Test Lexical Analyzer\n");
        System.out.print("Type of Instruction Scanned: Inherent\n");
        System.out.print("Type of Instruction Scanned: " + lextest);  System.out.println(); 
        

        //parser.

    }

}
