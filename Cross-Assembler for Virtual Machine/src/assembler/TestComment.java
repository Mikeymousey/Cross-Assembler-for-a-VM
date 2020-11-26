package assembler;
import java.io.*;

public class TestComment {

	public static void main(String[] args) throws IOException {
	    
		Comment com = new Comment("This is a new comment");
		

        System.out.print("Test Comment\n");
        System.out.println("This is a new comment");
        System.out.println(com.toString());
    }

}
