package assembler;

public class AssemblyUnit {
	//private EOF eof; //can't see how we would use this
	private static final int defaultSize = 100;
	private Linestatement[] asmFile;
	private int maxSize;
	private int currSize;
	
	public AssemblyUnit(int sz) {
		asmFile = new Linestatement[sz];
		for(int i = 0; i < sz; i++) {
			asmFile[i] = new Linestatement();
		}
		maxSize = sz;
		currSize = 0;
	}
	
	public AssemblyUnit() {
		this(defaultSize);
	}
	
	public Linestatement getLineStmt(int pos) {
		return asmFile[pos];
	}
	
	public void addLineStmt(Linestatement l) {
		if(currSize < maxSize) {
			asmFile[currSize++] = l;
		} else {
			System.out.println("AssemblyUnit full!");
		}
	}
	
	public void setLineStmt(Linestatement l, int i) {
		asmFile[i] = l;
	}
	
}
