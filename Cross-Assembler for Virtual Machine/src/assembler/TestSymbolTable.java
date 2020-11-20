
package assembler;
import java.io.*;

public class TestSymbolTable {



    public static void main(String[] args) throws IOException {

    //declare, initialize needed data members for linestatement and symbol table creation.    
    Mnemonic m1 = new Mnemonic();
    m1.setIdentifier("halt");

    Instruction i1 = new Instruction();
    i1.setMnemonic(m1);
    Label l1 =  new Label();
    Comment c1 = new Comment();
    EOL e1 = new EOL();

    Linestatement ls1 = new Linestatement();
    ls1.setInstruction(i1);
    SymbolTable st = new SymbolTable();

//test
    st.convertToLst(ls1);
    st.getSymbol("halt");

    System.out.print("Test SymbolTable\n");
    System.out.print("Opcode:0 | Identifier:halt\n");
    System.out.print("Opcode:" + m1.opcode + " | Identifier:" + st.getIdentifier(m1.opcode));
    System.out.println();
    
    



}
}
