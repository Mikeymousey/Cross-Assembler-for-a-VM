package test;

import assembler.*;
import java.io.*;


public class TestParser {
    static Parser parser;

    //static
    public static void main(String[] args) throws IOException{

        AssemblyUnit aUnit = new AssemblyUnit("Instruction_Test.asm");
        aUnit.asmFile = new Linestatement[5];
        aUnit.asmFile[0] = new Linestatement();
        aUnit.currPos = new Position(0, 0);
        Lexicalanalyzer lexer = new Lexicalanalyzer(aUnit);
        Parser p1 = new Parser(aUnit, lexer);
        String t0,t1,t2;
        t0 = p1.nextToken(" token0 token1 token2");
        t1 = p1.nextToken(" token0 token1 token2");
        t2 = p1.nextToken(" token0 token1 token2");
    

        
    
        System.out.print("Test Parser\n");
        System.out.print("Parsed Tokens: token0 token1 token2\n");
        System.out.print("Parsed Tokens: " + t0 + " " + t1 + " " + t2);
        System.out.println();

        //parser.parseLine("halt");

        //parser = new Parser()
        

    }

}
