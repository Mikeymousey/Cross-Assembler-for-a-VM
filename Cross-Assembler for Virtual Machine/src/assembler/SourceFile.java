package assembler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SourceFile {
	private String filePrefix;
	private String fileSuffix;
	private AssemblyUnit aUnit;
	public SourceFile(AssemblyUnit aunit) throws IOException {
		aUnit = aunit;
		ProcessFile();
	}
	public void ProcessFile() throws IOException {
		String[] splits = new String[2];
		splits = aUnit.fileName.split("\\.");
		filePrefix = splits[0];
		fileSuffix = splits[1];
		BufferedReader br = new BufferedReader(new FileReader(aUnit.fileName));
		int numoflines = 0;
		String str; 
		while((str = br.readLine()) != null) 
			numoflines++;
		aUnit.asmFile = new Linestatement[numoflines];
		aUnit.createArray();
		br = new BufferedReader(new FileReader(aUnit.fileName));
		while((str = br.readLine()) != null) 
			aUnit.readFile(str);//Sending line to lexical analyzer for parsing
		PrintLst(aUnit.asmFile);
	}
	public String PrintLst(Linestatement[] lstFile) {
		String str = "";
		for (int i = 0;  i < lstFile.length; i++) 
			str += String.format("%-3d%6s%7s%25s%n", i+1, "0"+lstFile[i].getInstruction().getMnemonic().getOpcode(), lstFile[i].getInstruction().getMnemonic().identifier, lstFile[i].getInstruction().getOperand().toString());
		return str;
	}
	public void GenerateLstFile() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter("TranslatedToLst.lst"));
		bw.write(PrintLst(aUnit.asmFile));
		bw.flush();
	}
	public String getFileName() {
		return filePrefix;
	}
	public void setFileName(String fileName) {
		this.filePrefix = fileName;
	}
	public String getExtensionType() {
		return fileSuffix;
	}
	public void setExtensionType(String extensionType) {
		this.fileSuffix = extensionType;
	}

}

