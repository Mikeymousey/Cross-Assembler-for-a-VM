package assembler;

public class Parser {
	public int parseLine(String[]s,int n) {//return 0 if it success without error, return else if something wrong
		// n is the number of statement that is valid
		
		/* draft that is not needed anymore for now
		 * int numValid=0;// number of valid statements for(int
		 * i=0;i<statement.length;i++) {//check how many are valid
		 * if(isEmpty(statement[i])) break; numValid++;
		 * 
		 * }
		 */
		switch(n) {
		case 0: //empty line
			return 0;
		case 1:
			if(SymbolTable.isSymbol(s[0])) {//1 label or instruction
				phaseIns(s[0]);
			}else {
				phaseLabel(s[0]);
			}
			break;
		case 2:
			if(SymbolTable.isSymbol(s[0])) {// ins, operand
				phaseIns(s[0]);
				phaseOperand(s[1]);
			}else {
				phaseLabel(s[0]);
				if(SymbolTable.isSymbol(s[1])) {// label ins
					phaseIns(s[1]);
				}else {
					//error message here since 2 label
					phaseError();
					return 1;
				}
				
			}
			break;
		case 3:
			phaseLabel(s[0]);
			if(SymbolTable.isSymbol(s[1])) {// label ins operand
				phaseIns(s[1]);
				phaseOperand(s[2]);
			}else {
				//error message here since 2 label
				phaseError();
				return 1;
			}
			break;
		}
		return 0;
		
	}
	
	void phaseIns(String ins) {
		phase instruction here
	}
	void phaseLabel(String l) {
		phase label here
	}
	void phaseOperand(String o) {
		phase operand here
	}
	void phaseError() {
		phase error here
	}
// not used code keep just in case
	
//	private boolean isEmptyOrComment(String s) {//check whether it is empty or it is a comment
//		if(s==null||s.equals(""))
//			return true;
//		if(s.charAt(0)==';')
//			return true;
//		else return false;
//	}
//	private boolean isEmpty(String s) {//check whether it is empty or it is a comment
//		if(s==null||s.equals(""))
//			return true;
//		
//		else return false;
//	}
//	private boolean isComment(String s) {//check whether it is empty or it is a comment
//		if(s.charAt(0)==';')
//			return true;
//		else return false;
//	}
	
}
