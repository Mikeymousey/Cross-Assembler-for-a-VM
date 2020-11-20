package assembler;
import java.io.*;

public class TestLinestatement {
    public static void main(String[] args) throws IOException {

        Linestatement l1 = new Linestatement();

        SymbolTable st = new SymbolTable();
        st.BuildTable();
        Mnemonic m1 = new Mnemonic();
        m1.setIdentifier("halt");
        

        Instruction i1 = new Instruction();
        i1.setMnemonic(m1);

        l1.setInstruction(i1);
        
       
        

       

        System.out.print("Test Line Statement\n");
        System.out.print("id[halt] | hex[0]\n");
        System.out.print("id[" + l1.getInstruction().getMnemonic().identifier + "]" + " | hex[" + l1.getInstruction().getMnemonic().opcode + "]"); System.out.println();
        




    }

}


