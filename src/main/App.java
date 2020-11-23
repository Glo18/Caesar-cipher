package main;

import models.Cipher;

import java.util.Scanner;

public class App {

    public static <console> void main(String[] args) {
        console myConsole = (console) System.console();
        Scanner myScanner = new Scanner(System.in);

        boolean programRunning = true;

        while (programRunning) {
            System.out.println("Welcome! Would you like to encrypt or decrypt a statement?");
            String userEncrypt = myConsole.readLine();

            if (userEncrypt.equals("encrypt")) {
                System.out.println("Enter your statement:");
                String statement = myConsole.readLine();

                System.out.println("Enter encryption key:");
                int key = myScanner.nextInt();

                Cipher userEncryption = new Cipher(statement, key);
                String encryption = userEncryption.isEncrypted(statement, key);

                System.out.println("Here is your encrypted statement: \n" + encryption);
            } else if (userEncrypt.equals("decrypt")) {
                System.out.println("Enter your statement:");
                String statementDecrypt = myConsole.readLine();

                System.out.println("Enter decryption key:");
                int key = myScanner.nextInt();

                Cipher userDecryption = new Cipher(statementDecrypt, keyDecrypt);
                String decryption = userDecryption.toDecrypt(statementDecrypt, keyDecrypt);
                System.out.println("Here is your decrypted statement: \n" + decryption);
            } else if (userEncrypt.equals("Exit")){
                System.out.println("Goodbye!");
                programRunning = false;
            }
            else {
                System.out.println("I'm sorry we don't recognize your input");
            }
        }
    }
}
