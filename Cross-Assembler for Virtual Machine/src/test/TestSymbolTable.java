package test;
import java.io.*;
import assembler.*;

public class TestSymbolTable {



    public static void main(String[] args) throws IOException {

    //declare, initialize needed data members for linestatement and symbol table creation.    
    SymbolTable st = new SymbolTable();
    Node table = new Node("luca", 22);
    st.addNode(table);

//test


    System.out.print("Test SymbolTable\n");
    System.out.print("Opcode: 22\n");
    System.out.print("Opcode: " + st.getOpcode("luca"));
    System.out.println();
}
}
