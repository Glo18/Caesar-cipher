package main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        console myConsole = System.console();
        Scanner myScanner = new Scanner(System.in);

        boolean runProgram = true;

        System.out.println("Welcome! Would you like to encrypt or decrypt a statement?");
        String userEncryption = myConsole.readLine();
    }
}
