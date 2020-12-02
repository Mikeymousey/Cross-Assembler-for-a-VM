package test;

import assembler.*;
import java.io.*;


public class TestParser {
    static Parser parser;

    //static
    public static void main(String[] args) throws IOException{


        Lexicalanalyzer lexer;
        AssemblyUnit aUnit;
        Parser testparse;

        aUnit = new AssemblyUnit("Instruction_Test.asm");
        lexer = new Lexicalanalyzer(aUnit);
        

        //parser.parseLine("halt");

        //parser = new Parser()
        parser.nextToken("halt halt");

    }

}
