package test;

import java.io.*;

import assembler.*;

public class TestMnemonic {
    public static void main(String[] args) throws IOException {


        SymbolTable st = new SymbolTable();
        Mnemonic m1 = new Mnemonic();
        Instruction i1 = new Instruction();
        i1.setMnemonic(m1);
        m1.setIdentifier("halt");


        System.out.print("Test Mnemonic\n");
        System.out.print("id[halt],opcode[0]\n");
        System.out.print("id[" + m1.identifier + "]" + ",opcode[" + m1.opcode + "]");
        System.out.println();

    }

}
