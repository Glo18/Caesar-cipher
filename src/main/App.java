package main;

import models.Cipher;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        console myConsole = System.console();
        Scanner myScanner = new Scanner(System.in);

        boolean runProgram = true;

        System.out.println("Welcome! Would you like to encrypt or decrypt a statement?");
        String userEncryption = myConsole.readLine();

        if (userEncryption.equals("encrypt")) {
            System.out.println("Enter your statement:");
            String statement = myConsole.readLine();

            System.out.println("Enter encryption key:");
            int key = myScanner.nextInt();

            Cipher userEncryption = new Cipher(statement, key);
            String encryption = userEncryption.isEncrypted(statement, key);
            System.out.println("The statement that's encrypted is /n" + encryption);
        }
        else if (userEncryption.equals("decrypt")) {
            System.out.println("Enter your statement:");
            String statementDecrypt = myConsole.readLine();

            System.out.println("Enter decrption key:");
            int key = myScanner.nextInt();

            C
        }
    }
}
