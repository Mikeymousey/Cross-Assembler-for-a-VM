package test;

import assembler.Parser;

public class TestParser {
	static Parser parser;
	//static
	public static void main(String[] args) {
		//parser.parseLine("halt");
		
		//parser = new Parser()
		parser.nextToken("halt halt");
		
	}

}
