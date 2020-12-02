package test;

import java.io.IOException;

import assembler.Label;

public class TestLabel {

    static Label l1 = new Label("push");

    public static void main(String[] args) throws IOException {

        System.out.print("Test Label\n");
        System.out.print("push\n");
        System.out.print(l1.toString());
        System.out.println();
    }
}
