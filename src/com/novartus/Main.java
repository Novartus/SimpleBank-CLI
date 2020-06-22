package com.novartus;

import java.util.Scanner;
public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int sentinal = 0;
        int size = 0;
        double[] accountBalances = new double[250];
        String[] accountNames = new String[250];

        while (sentinal != -1) {
            System.out.println("Bank Admin Menu");
            System.out.println("Please Enter a Menu Option");
            System.out.println("(1): Add Customer to Bank");
            System.out.println("(2): Change Customer Name");
            System.out.println("(3): Check Account Balance");
            System.out.println("(4): Modify Account Balance");
            System.out.println("(5): Summary of All Accounts");
            System.out.println("(-1): Quit");

            int userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println("Bank Add Customer Menu");
                System.out.println("Please Enter an account balance");
                double balance = scanner.nextDouble();
                accountBalances[size] = balance;
                System.out.println("Please enter an account holder name: ");
                scanner.nextLine();
                String name = scanner.nextLine();
                accountNames[size] = name;
                System.out.println("Customer's ID is :" + size);
                size = size + 1;
            } else if (userInput == 2) {
                System.out.println("Bank Change Name Menu");
                System.out.println("Please Enter a customer ID to change their name");
                int index = scanner.nextInt();
                System.out.println("What is the customer's new name?");
                scanner.nextLine();
                accountNames[index] = scanner.nextLine();
            } else if (userInput == 3) {
                System.out.println("Bank Check Balance Menu");
                System.out.println("Please Enter a customer ID to check their balance");
                int index = scanner.nextInt();
                double balance = accountBalances[index];
                System.out.println("This customer has $" + balance + " in their account");
            } else if (userInput == 4) {
                System.out.println("Bank Modify Balance Menu");
                System.out.println("Please Enter a customer ID to check their balance");
                int index = scanner.nextInt();
                System.out.println("What is the customer's new account balance");
                accountBalances[index] = scanner.nextDouble();
            } else if (userInput == 5) {
                System.out.println("Bank All Customer Summary Menu");
                double total = 0;
                for (int i = 0; i < size; i++) {
                    total = total + accountBalances[i];
                    System.out.println(accountNames[i] + " has $" + accountBalances[i] + " in their account");
                }
                System.out.println("In total, there is $" + total + " in the bank");
            } else if (userInput == -1) {
                System.exit(-1);
            } else {
                System.out.println("Error: Invalid scanner entered");
            }
        }
    }
}
