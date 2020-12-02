package test;
import java.io.*;
import assembler.*;

public class TestInherent {
    public static void main(String[] args) throws IOException {

        //Creation of Inherent objects dependants.
        Inherent inhetest = new Inherent();
        Mnemonic mnemtest = new Mnemonic();
        Operand optest = new Operand();
        Instruction i1 = new Instruction();

        //Set
        mnemtest.setIdentifier("halt");
        i1.setMnemonic(mnemtest);
        optest.setValue(2);

        inhetest.setOperand(optest);
        inhetest.setMnemonic(mnemtest);
        inhetest.setSize(1);
        

        System.out.print("Test Inherent\n");

        System.out.print("Mnemonic: halt | Opcode: 0 | Size: 1\n");
        System.out.print("Mnemonic: " + mnemtest.identifier + " | " + "Opcode: " + mnemtest.opcode + " | Size: " + inhetest.getSize() );
        

        System.out.println();

   

        



    }

}
