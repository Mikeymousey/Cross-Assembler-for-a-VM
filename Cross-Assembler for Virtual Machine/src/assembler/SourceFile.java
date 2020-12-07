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
	private Parser parser;
	public SourceFile(AssemblyUnit aunit, Parser parser) throws IOException {
		aUnit = aunit;
		this.parser = parser;
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
			//System.out.println(str);
			parser.parseLine(str);//Sending line to lexical analyzer for parsing

		aUnit.getLexer().Resolve();	
		GenerateLstFile();
		generateExeFile();
		aUnit.errep.printErrors();
	}
	public String PrintLst(Linestatement[] lstFile) {
		String str = String.format("%-5s%-6s%-15s%-15s%-20s%-15s%n", "Line", "Addr", "Machine Code", "Label","Assembly Code", "Comments");
		for (int i = 0;  i < lstFile.length; i++) {
		//switch statement
			if (aUnit.asmFile[i].getInstruction().isDirective()) {
				str += String.format("%-5d%04X ", i+1, lstFile[i].getInstruction().getAddress());
				for (int k = 0; k < lstFile[i].getInstruction().getOperand().toString().length(); k++) {
					str += String.format("%02X ", (int) lstFile[i].getInstruction().getOperand().toString().charAt(k));
				}
				str += String.format("%02X ", 0);
				str += String.format("\t\t %-10s  %2s\t %s%s%n", lstFile[i].getLabel().toString(), ".cstring", '"' + lstFile[i].getInstruction().getOperand().toString() + '"', lstFile[i].getComment().toString());
			} else {
				switch (aUnit.asmFile[i].getInstruction().getSize()){
					case 0:
						str += String.format("%-5d%04X  \t\t %-10s \t %s%s%n", i+1, lstFile[i].getInstruction().getAddress(), lstFile[i].getLabel().toString(), lstFile[i].getInstruction().getOperand().toString(), lstFile[i].getComment().toString());
						break;
					case 1:
						str += String.format("%-5d%04X  %02X\t\t %-10s  %2s\t %s%s%n", i+1, lstFile[i].getInstruction().getAddress(),lstFile[i].getInstruction().getMnemonic().getOpcode(), lstFile[i].getLabel().toString(), lstFile[i].getInstruction().getMnemonic().identifier, lstFile[i].getInstruction().getOperand().toString(), lstFile[i].getComment().toString());
						break;
					case 2:
						str += String.format("%-5d%04X  %02X %02X\t %-10s  %2s\t %s%s%n", i+1, lstFile[i].getInstruction().getAddress(),lstFile[i].getInstruction().getMnemonic().getOpcode(),  lstFile[i].getInstruction().getOperand().getValue(), lstFile[i].getLabel().toString(), lstFile[i].getInstruction().getMnemonic().identifier, lstFile[i].getInstruction().getOperand().toString(), lstFile[i].getComment().toString());
						break;
					case 3:
						str += String.format("%-5d%04X  %02X %04X\t %-10s  %2s\t %s%s%n", i+1, lstFile[i].getInstruction().getAddress(),lstFile[i].getInstruction().getMnemonic().getOpcode(), lstFile[i].getInstruction().getOperand().getValue(), lstFile[i].getLabel().toString(), lstFile[i].getInstruction().getMnemonic().identifier, lstFile[i].getInstruction().getOperand().toString(), lstFile[i].getComment().toString());
						break;
				}
			}
		}
		return str;
	}
	public void GenerateLstFile() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(filePrefix + ".lst"));
		bw.write(PrintLst(aUnit.asmFile));
		bw.flush();
	}
	public String getFileName() {
		return filePrefix;
	}
	public String PrintExe(Linestatement[] lstFile) {
        String str = "";
        for (int i = 0;  i < lstFile.length; i++) {
        	if(aUnit.asmFile[i].getInstruction().isDirective()) {
        		for (int k = 0; k < lstFile[i].getInstruction().getOperand().toString().length(); k++) {
					str += String.format("%02X", (int) lstFile[i].getInstruction().getOperand().toString().charAt(k));
				}
        		str += String.format("%02X", 0);
        	} else {
        		switch (aUnit.asmFile[i].getInstruction().getSize()){
        		case 0:
        			//str += String.format("%-5d%04X  \t\t %-10s \t %s%s%n", i+1, lstFile[i].getInstruction().getAddress(), lstFile[i].getLabel().toString(), lstFile[i].getInstruction().getOperand().toString(), lstFile[i].getComment().toString());
        			break;
        		case 1:
        			str += String.format("%02X", lstFile[i].getInstruction().getMnemonic().getOpcode());
        			break;
        		case 2:
        			str += String.format("%02X%02X", lstFile[i].getInstruction().getMnemonic().getOpcode(), lstFile[i].getInstruction().getOperand().getValue());
        			break;
        		case 3:
        			str += String.format("%02X%04X", lstFile[i].getInstruction().getMnemonic().getOpcode(), lstFile[i].getInstruction().getOperand().getValue());
        			break;
        		}
        	}
        }
        return str;
    }
	public void generateExeFile() throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(filePrefix + ".exe"));
		bw.write(PrintExe(aUnit.asmFile));
		bw.flush();
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

//combine generate .lst and .exe
//switch on size
//case 1 size 1 : inherent, immediate
//case 2 size 2 : trap
//case 3 size 3 : relative

