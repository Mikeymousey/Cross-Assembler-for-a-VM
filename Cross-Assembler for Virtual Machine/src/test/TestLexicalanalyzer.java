package test;
import assembler.*;

import java.io.IOException;

import assembler.AssemblyUnit;
import assembler.Lexicalanalyzer;
import assembler.Parser;

public class TestLexicalanalyzer {
	static Lexicalanalyzer lexer;
	static AssemblyUnit aUnit;
	static Parser parser;
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		aUnit = new AssemblyUnit("Instruction_Test.asm");
		
		 lexer = new Lexicalanalyzer(aUnit);
		//lexer.scanLabel("sam");
		SymbolTable.addNode(new Node("sam", 10));
		//parser = new Parser(aUnit, lexer);
		
		
		System.out.print("Test Lexical Analyzer\n");
		System.out.print("Expected OPCODE: 10\n");
		System.out.print("Expected OPCODE: " + SymbolTable.getOpcode("sam"));System.out.println();
		
		//parser.
		
	}

}
