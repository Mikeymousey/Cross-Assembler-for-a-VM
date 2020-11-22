package assembler;

public class SymbolTable {
	static Node[] table = new Node[50]; //25 for instructions 25 for labels 
	static int currSize;
	static int maxSize;
	public SymbolTable() {
		BuildTable();
		currSize = 25;
		maxSize = 50;
	}

	/*
	 * public void convertToLst(Linestatement linestatement) {
	 * linestatement.getInstruction().getMnemonic().setOpcode(getSymbol(
	 * linestatement.getInstruction().getMnemonic().identifier)); }
	 */
	public static int getOpcode(String mnemonic) //Returns Opcode
	{
		for (int i = 0; i < maxSize; i++)
			if (mnemonic == table[i].getNodeIdentifier()) {
				return table[i].getNodeHex();
			}
		return -1;//incorrect identifier
	}
	
	public static void addNode(Node n) {
		if(currSize < maxSize) {
			table[currSize++] = n;
			System.out.println("added node " + n.getNodeIdentifier() + n.getNodeHex());
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
	}
	

	
		
		
		
		
		
		
		

}
