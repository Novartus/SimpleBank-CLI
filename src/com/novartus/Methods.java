package com.novartus;

import java.util.Scanner;

public class Methods extends Main{
    Scanner scanner = new Scanner(System.in);

    void CreateAccount(){
        try {
            System.out.println("Bank Add Customer Menu");
            System.out.println("Please Enter an account balance");
            double balance = scanner.nextDouble();
            accountBalances[size] = balance;
            System.out.println("Please enter an account holder name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            accountNames[size] = name;
            System.out.println("Customer's ID is :" + size);
            size += 1;
        } catch (Exception e) {
            System.out.println("Please Try Again Option 1");
        }
    }

    void ChangeCustomerName(){
        try {
            System.out.println("Bank Change Name Menu");
            System.out.println("Please Enter a customer ID to change their name");
            int index = scanner.nextInt();
            System.out.println("What is the customer's new name?");
            scanner.nextLine();
            accountNames[index] = scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Please Try Again Option 2");
        }
    }

    void AccountBalance(){
        try {
            System.out.println("Bank Check Balance Menu");
            System.out.println("Please Enter a customer ID to check their balance");
            int index = scanner.nextInt();
            double balance = accountBalances[index];
            System.out.println("This customer has $" + balance + " in their account");
        } catch (Exception e) {
            System.out.println("Please Try Again Option 3");
        }
    }

    void ModifyBalance(){
        try {
            System.out.println("Bank Modify Balance Menu");
            System.out.println("Please Enter a customer ID to check their balance");
            int index = scanner.nextInt();
            System.out.println("What is the customer's new account balance");
            accountBalances[index] = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Please Try Again Option 4");
        }
    }

    void Summary(){
        System.out.println("Bank All Customer Summary Menu");
        double total = 0;
        for (int i = 0; i < size; i++) {
            total = total + accountBalances[i];
            System.out.println(accountNames[i] + " has $" + accountBalances[i] + " in their account");
        }
        System.out.println("In total, there is $" + total + " in the bank");
    }
}
