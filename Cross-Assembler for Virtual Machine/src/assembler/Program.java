package assembler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
	private static Lexicalanalyzer lex;
	
	public static void main(String[] args) throws IOException {
		String fileName = "testOne.asm";
		String[] splits = new String[2];
		splits = splitFileInfo(fileName); 
		SourceFile sf = new SourceFile(splits[0], splits[1]);
		//System.out.println(sf.getFileName());
		//System.out.println(sf.getExtensionType());
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		int numOfLines = 0; //Keeps tracks of how many lines in the file
		String str; //Keeps track of the Line being read
		
		//Find number of lines
		while((str = br.readLine()) != null) {
			numOfLines++;
		}
		br = new BufferedReader(new FileReader(fileName));
		lex = new Lexicalanalyzer(numOfLines);
		//Parse information
		while((str = br.readLine()) != null) {
			lex.readLine(str);//Sending line to lexical analyzer for parsing
		}
		tester();
	}
	public static String[] splitFileInfo(String file) {
		String [] split = new String[2];
		split = file.split("\\.");
		return split;
	}
	
	public static void tester() {
		/*System.out.println("Test One: <3");
		System.out.println("0");
		System.out.println("13");
		System.out.println("d");*/
		lex.outOpcodes();
	}
	
}
