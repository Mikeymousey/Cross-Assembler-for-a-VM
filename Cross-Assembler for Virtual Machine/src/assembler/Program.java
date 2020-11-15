package assembler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Test.asm"));
		int numOfLines = 0; //Keeps tracks of how many lines in the file
		String str; //Keeps track of the Line being read
		
		//Find number of lines
		while((str = br.readLine()) != null) {
			numOfLines++;
		}
		Lexicalanalyzer lex = new Lexicalanalyzer(numOfLines);
		//Parse information
		while((str = br.readLine()) != null) {
			lex.Parse(str);//Sending line to lexical analyzer for parsing
		}
	}

}
