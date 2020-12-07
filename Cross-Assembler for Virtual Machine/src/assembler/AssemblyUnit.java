package assembler;

import java.io.IOException;

public class AssemblyUnit {
	public Position currPos;
	public ErrorReporter errep;
	private Lexicalanalyzer Lex;
	public Linestatement [] asmFile; 
	public String fileName;
	public int address;
	private Parser parser;
	public AssemblyUnit(String filename) throws IOException 
	{
		fileName = filename;
		address = 0;
		currPos = new Position(0, 0);
		errep = new ErrorReporter();
		new SymbolTable();
		Lex = new Lexicalanalyzer(this);
		parser = new Parser(this, Lex);
		SourceFile sf = new SourceFile(this, parser);
	}
	/*public void readFile(String s) throws IOException 
	{
		if(s.charAt(0) != '\t') {
			
		}
		
		String str = s.trim();
		char[] wordBuf = new char[str.length()];
		int inWordCnt = 0;
		for(int i = 0; i < str.length()+1; i++) 
		{
			if(i<str.length()) {
			if(!isSpace(str.charAt(i))) {//for anything that isn't whitespace put it in a word buffer
				wordBuf[inWordCnt] = str.charAt(i);
				inWordCnt++;
			} else if (inWordCnt > 0){
				Lex.Parse(wordBuf);//send any sequence of non white-space characters to the Parse function
				inWordCnt = 0;
			}
			}else {
				Lex.Parse(wordBuf);
			}
			currPos.incChar();
		}
		currPos.incLine();
	}*/

	public void createArray() 
	{
		for(int i = 0; i<asmFile.length; i++) //Create instances
			asmFile[i] = new Linestatement();
	}
	
	public Lexicalanalyzer getLexer() {
		return Lex;
	}
		
	
}
