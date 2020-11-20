package assembler;
import java.io.*;

public class TestMnemonic {
    public static void main(String[] args) throws IOException {
        
        Mnemonic m1 = new Mnemonic();
        m1.setIdentifier("halt");
        m1.setOpcode(0);

        
        System.out.print("Test Mnemonic\n");
        System.out.print("id[halt],opcode[0]\n");
        System.out.print("id["+ m1.getIdentifier() + "]" + ",opcode[" + m1.getOpcode() + "]"); System.out.println();
    }

}
