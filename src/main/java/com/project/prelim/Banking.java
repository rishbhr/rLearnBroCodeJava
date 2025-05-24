package com.project.prelim;

import java.util.Scanner;

public class Banking {
    public static Scanner scanner = new Scanner(System.in);
        static void main(String[] args) {
        // Java Banking Program
        // Variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            // Display Menu
            System.out.println("*************");
            System.out.println("Banking Program");
            System.out.println("*************");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Finished");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Get and Process user choice
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance = balance - withdraw(balance);
                case 4 -> isRunning = false;
            }
        }
        // Exit message
        System.out.println("Have a nice day!");
        scanner.close();
    }

    // showBalance()
    static void showBalance(double balance) {
        System.out.println("*************");
        System.out.printf("Your balance is: $%.2f\n",balance);
    }

    // deposit()
    static double deposit() {
        double amount;
        System.out.print("Enter deposit amount: ");
        amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Amount cant be negative");
            return 0;
        } else {
            return amount;
        }
    }

    // withdraw()
    static double withdraw(double balance) {
        double amount;
        System.out.print("Enter withdrawal amount: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Cannot overdraft.");
            return 0;
        } else if(amount < 0) {
            System.out.println("Amount cant be Negative");
            return 0;
        } else {
            return amount;
        }
    }


}
