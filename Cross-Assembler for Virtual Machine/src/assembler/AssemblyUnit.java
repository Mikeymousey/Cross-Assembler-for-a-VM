package assembler;

import java.io.IOException;

public class AssemblyUnit {
	public Position currPos;
	public ErrorReporter errep;
	private Lexicalanalyzer Lex;
	public Linestatement [] asmFile; 
	public String fileName;
	public int address;
	public AssemblyUnit(String filename) throws IOException 
	{
		fileName = filename;
		address = 0;
		currPos = new Position(0, 0);
		errep = new ErrorReporter();
		new SymbolTable();
		Lex = new Lexicalanalyzer(this);
		SourceFile sf = new SourceFile(this);
		sf.GenerateLstFile();
	}
	public void readFile(String s) throws IOException 
	{
		String str = s.trim();
		char[] wordBuf = new char[str.length()];
		//added here
		String[] statement=new String[3];//used for parsing later, reason of 3: label mnemonic operand
		int statementCnt=0;
		//
		int inWordCnt = 0;
		for(int i = 0; i < str.length()+1; i++) 
		{
			
			if(i<str.length()) {
				if((!isSpace(str.charAt(i)))&&(!isComment(str.charAt(i)))) {//for anything that isn't whitespace put it in a word buffer also not a comment
					wordBuf[inWordCnt] = str.charAt(i);
					inWordCnt++;
				} else if (inWordCnt > 0){
					//added here
					
					statement[statementCnt]=new String(wordBuf);
					statementCnt++;
					
					wordBuf=new char[str.length()];
					//original code here 
					//Lex.Parse(wordBuf);//send any sequence of non white-space characters to the Parse function
					inWordCnt = 0;
				}
			}else {
				if(inWordCnt!=0)
					statement[statementCnt]=new String(wordBuf);
				//original code here 
				//Lex.Parse(wordBuf);
			}
			currPos.incChar();
		}
		currPos.incLine();
		//Phaser code here
		
	}
	private boolean isSpace(int c) 
	{
		return (c == ' ' || c == '\t' || c == '\n');
	}
	public void createArray() 
	{
		for(int i = 0; i<asmFile.length; i++) //Create instances
			asmFile[i] = new Linestatement();
	}

	private boolean isComment(char c) {
		return (c==';');
	}
		
	
}
