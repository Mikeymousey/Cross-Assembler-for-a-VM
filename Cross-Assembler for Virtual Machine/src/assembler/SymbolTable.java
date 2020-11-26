package assembler;

public class SymbolTable {
	static Node[] table;  
	static final int defaultSize = 100;
	static int currSize;
	static int maxSize;
	public SymbolTable(int n) {
		table = new Node[n];
		maxSize = n;
		BuildTable();
	}
	
	public SymbolTable() {
		this(defaultSize);
	}

	/*
	 * public void convertToLst(Linestatement linestatement) {
	 * linestatement.getInstruction().getMnemonic().setOpcode(getSymbol(
	 * linestatement.getInstruction().getMnemonic().identifier)); }
	 */
	public static int getOpcode(String mnemonic) //Returns Opcode
	{
		for (int i = 0; i < currSize; i++)
			if (mnemonic == table[i].getNodeIdentifier() || mnemonic.equals(table[i].getNodeIdentifier())) {
				return table[i].getNodeHex();
			}
		return -1;//incorrect identifier
	}
	
	public static void addNode(Node n) {
		if(currSize < maxSize) {
			table[currSize++] = n;
			System.out.println("added node: " + n.getNodeIdentifier() + "at: " + n.getNodeHex());
		}
	}

	public void BuildTable() 
	{
		table[0] = new Node("halt", 0x00);
		table[1] = new Node("pop", 0x01);
		table[2] = new Node("dup", 0x02);
		table[3] = new Node("exit", 0x03);
		table[4] = new Node("ret", 0x04);
		table[5] = new Node("not", 0x0C);
		table[6] = new Node("and", 0x0D);
		table[7] = new Node("or", 0x0E);
		table[8] = new Node("xor", 0x0F);
		table[9] = new Node("neg", 0x10);
		table[10] = new Node("inc", 0x11);	
		table[11] = new Node("dec", 0x12);
		table[12] = new Node("add", 0x13);
		table[13] = new Node("sub", 0x14);
		table[14] = new Node("mul", 0x15);
		table[15] = new Node("div", 0x16);
		table[16] = new Node("rem", 0x17);
		table[17] = new Node("shl", 0x18);
		table[18] = new Node("shr", 0x19);
		table[19] = new Node("teq", 0x1A);
		table[20] = new Node("tne", 0x1B);
		table[21] = new Node("tlt", 0x1C);
		table[22] = new Node("tgt", 0x1D);
		table[23] = new Node("tle", 0x1E);
		table[24] = new Node("tge", 0x1F);
		table[25] = new Node("br.i5", 0x30);
		table[26] = new Node("brf.15", 0x50);
		table[27] = new Node("enter.u5", 0x70);
		table[28] = new Node("ldc.i3", 0x90);
		table[29] = new Node("addv.u3", 0x98);
		table[30] = new Node("ldv.u3", 0xA0);
		table[31] = new Node("stv.u3", 0xA8);
		currSize = 32;
	}
	

	
		
		
		
		
		
		
		

}
