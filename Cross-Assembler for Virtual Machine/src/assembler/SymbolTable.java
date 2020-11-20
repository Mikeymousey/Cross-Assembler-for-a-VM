package assembler;

public class SymbolTable {
	static Node[] table = new Node[25];
	public SymbolTable() {
		BuildTable();
	}

	/*
	 * public void convertToLst(Linestatement linestatement) {
	 * linestatement.getInstruction().getMnemonic().setOpcode(getSymbol(
	 * linestatement.getInstruction().getMnemonic().identifier)); }
	 */
	public static String getHexOpcode(String mnemonic) //Returns Opcode
	{
		for (int i = 0; i<25; i++)
			if (mnemonic == table[i].getNodeIdentifier()) {
				return table[i].getNodeHex();
			}
		return "Incorrect identifier";//incorrect identifier
	}

	public void BuildTable() 
	{
		table[0] = new Node("halt", 0);
		table[1] = new Node("pop", 1);
		table[2] = new Node("dup", 2);
		table[3] = new Node("exit", 3);
		table[4] = new Node("ret", 4);
		table[5] = new Node("not", 12);
		table[6] = new Node("and", 13);
		table[7] = new Node("or", 14);
		table[8] = new Node("xor", 15);
		table[9] = new Node("neg", 16);
		table[10] = new Node("inc", 17);	
		table[11] = new Node("dec", 18);
		table[12] = new Node("add", 19);
		table[13] = new Node("sub", 20);
		table[14] = new Node("mul", 21);
		table[15] = new Node("div", 22);
		table[16] = new Node("rem", 23);
		table[17] = new Node("shl", 24);
		table[18] = new Node("shr", 25);
		table[19] = new Node("teq", 26);
		table[20] = new Node("tne", 27);
		table[21] = new Node("tlt", 28);
		table[22] = new Node("tgt", 29);
		table[23] = new Node("tle", 30);
		table[24] = new Node("tge", 31);
	}
	

	
		
		
		
		
		
		
		

}
