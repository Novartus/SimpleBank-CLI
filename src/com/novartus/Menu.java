package com.novartus;

import java.util.Scanner;


public class Menu extends Main {
    protected Menu() {

        Scanner scanner = new Scanner(System.in);
        Methods objMethods = new Methods();
        while (count != -1) {
            System.out.println("Bank Admin Menu");
            System.out.println("Please Enter a Menu Option");
            System.out.println("(1): Add Customer to Bank");
            System.out.println("(2): Change Customer Name");
            System.out.println("(3): Check Account Balance");
            System.out.println("(4): Modify Account Balance");
            System.out.println("(5): Summary of All Accounts");
            System.out.println("(6): Cloud Database Connectivity ?");
            System.out.println("(-1): Quit");

            int userInput = scanner.nextInt();
            if (userInput == 1) {
                objMethods.CreateAccount();
            } else if (userInput == 2) {
                objMethods.ChangeCustomerName();
            } else if (userInput == 3) {
                objMethods.AccountBalance();
            } else if (userInput == 4) {
                objMethods.ModifyBalance();
            } else if (userInput == 5) {
                objMethods.Summary();
            } else if (userInput == -1) {
                objMethods.MongoDBConnection();
            } else if (userInput == -1) {
                System.exit(-1);
            } else {
                System.out.println("Error: Invalid scanner entered");
            }
        }
    }
}
