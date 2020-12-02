package test;

import java.io.*;

import assembler.*;


public class TestRelative {


    public static void main(String[] args) throws IOException {

        //Creation of relative objects dependants.
        Relative reltest = new Relative();
        Mnemonic mnemtest = new Mnemonic();
        Operand optest = new Operand();
        Instruction i1 = new Instruction();

        //Set
        mnemtest.setIdentifier("halt");
        i1.setMnemonic(mnemtest);
        optest.setValue(2);

        reltest.setOperand(optest);
        reltest.setMnemonic(mnemtest);
        reltest.setSize(2);
        reltest.setRange(0, 1);
        


        System.out.print("Test Relative\n");
        System.out.print("Mnemonic: halt | Opcode: 0 | Size: 2 | inRange: false\n");
        System.out.print("Mnemonic: " + mnemtest.identifier + " | " + "Opcode: " + mnemtest.opcode + " | Size: " + reltest.getSize() + " | inRange: " + reltest.inRange(2) ); System.out.println();
     
        




    }

}
