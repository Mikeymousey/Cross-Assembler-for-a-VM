package assembler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		String fileName = "Instruction_Test.asm";
		String[] splits = new String[2];
		splits = splitFileInfo(fileName); 
		SourceFile sf = new SourceFile(splits[0], splits[1]);
		System.out.println(sf.getFileName());
		System.out.println(sf.getExtensionType());
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		int numOfLines = 0; //Keeps tracks of how many lines in the file
		String str; //Keeps track of the Line being read
		
		//Find number of lines
		while((str = br.readLine()) != null) {
			numOfLines++;
		}
		br = new BufferedReader(new FileReader(fileName));
		Lexicalanalyzer lex = new Lexicalanalyzer(numOfLines);
		//Parse information
		while((str = br.readLine()) != null) {
			lex.readLine(str);//Sending line to lexical analyzer for parsing
		}
	}
	public static String[] splitFileInfo(String file) {
		String [] split = new String[2];
		split = file.split("\\.");
		return split;
	}
}
