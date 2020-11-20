package assembler;
import java.io.*;

public class TestNode {
    static Node table = new Node("halt", 0);
    public static void main(String[] args) throws IOException {
        

        System.out.print("Test Node\n");
        System.out.print("id[halt],hex[0]\n");
        System.out.print("id["+ table.getNodeIdentifier() + "],hex[" + table.getNodeHex() + "]"); System.out.println();
    }


}
