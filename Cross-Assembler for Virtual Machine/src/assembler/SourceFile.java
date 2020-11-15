package assembler;

public class SourceFile {
	private String fileName;
	private String extensionType;
	public SourceFile(String fname, String etype) {
		fileName = fname;
		extensionType = etype;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getExtensionType() {
		return extensionType;
	}
	public void setExtensionType(String extensionType) {
		this.extensionType = extensionType;
	}
}
