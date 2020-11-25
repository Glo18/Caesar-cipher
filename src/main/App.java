package main;

import models.Cipher;

import java.util.Scanner;

import java.io.Console;
public class App {

    private static int keyDecrypt;

    public static void main(String[] args) {
        Console myConsole = System.console();
        Scanner myScanner = new Scanner(System.in);

        boolean programRunning = true;

        while (programRunning) {
            System.out.println("Welcome! Would you like to encrypt or decrypt a statement?");
            String userEncrypt = myConsole.readLine();

            switch (userEncrypt) {
                case "encrypt": {
                    System.out.println("Enter your statement:");
                    String statement = myConsole.readLine();

                    System.out.println("Enter encryption key:");
                    int key = myScanner.nextInt();

                    Cipher userEncryption = new Cipher(statement, key);
                    String encryption = userEncryption.isEncrypted(statement, key);

                    System.out.println("Here is your encrypted statement: \n" + encryption);
                    break;
                }
                case "decrypt": {
                    System.out.println("Enter your statement:");
                    String statementDecrypt = myConsole.readLine();

                    System.out.println("Enter decryption key:");
                    int key = myScanner.nextInt();

                    Cipher userDecryption = new Cipher(statementDecrypt, keyDecrypt);
                    String decryption = userDecryption.toDecrypt(statementDecrypt, keyDecrypt);
                    System.out.println("Here is your decrypted statement: \n" + decryption);
                    break;
                }
                case "Exit":
                    System.out.println("Goodbye!");
                    programRunning = false;
                    break;
                default:
                    System.out.println("I'm sorry we don't recognize your input");
                    break;
            }
        }
    }

}
