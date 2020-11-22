package assembler;

import java.io.IOException;

public class TestLexicalanalyzer {
	static Lexicalanalyzer lexer;
	static AssemblyUnit aUnit;
	static Parser parser;
	public static void main(String[] args) throws IOException {
		aUnit = new AssemblyUnit("Instruction_Test.asm");
		lexer = new Lexicalanalyzer(aUnit);
		//lexer.scanLabel("sam");
		SymbolTable.addNode(new Node("sam", 10));
		System.out.print(SymbolTable.getOpcode("sam"));
		parser = new Parser(aUnit, lexer);
		//parser.
		
	}

}
