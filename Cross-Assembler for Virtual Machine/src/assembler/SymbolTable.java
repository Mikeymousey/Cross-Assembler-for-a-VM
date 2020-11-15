package assembler;

public class SymbolTable {
	Node[] table = new Node[11];
	public SymbolTable() {
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
		
	}
	public void convertToLst(Linestatement linestatement) {
		linestatement.getInstruction().getMnemonic().setOpcode(getSymbol(linestatement.getInstruction().getMnemonic().identifier));
	}
	public int getSymbol(String str) {
		for (int i = 0; i<11; i++)
			if (str == table[i].getNodeIdentifier()) {
				return table[i].getNodeHex();
			}
		return -1;//incorrect identifier
	}
	
		
		
		
		
		
		
		

}
