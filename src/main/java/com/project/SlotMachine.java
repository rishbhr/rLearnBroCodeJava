package com.project;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {
        //Slot Machine
        //Variables
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet = 0;
        int payout = 0;
        String playAgain;
        String[] row;

        //Welcome message
        System.out.println("***********************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: 🍉🫐🍇🍔🍣 ");
        System.out.println("***********************");

        //Display if balance > 0
        while(balance > 0) {
            System.out.println("Current balance: " + balance);
            System.out.print("Place your bet: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if(bet > balance) {
                System.out.println("insufficient funds");
                continue;
            } else if (bet <= 0 ) {
                System.out.println("bet must be greater than 0");
                continue;
            } else {
                balance -= bet;
                //spin row
                System.out.println("Spinning.....");
                row = spinRow();

                //display row
                printRow(row);

                //get payout
                payout = getPayout(row, bet);
                if (payout > 0) {
                    System.out.println("You won $ " + payout);
                    balance += payout;
                    System.out.println("Your balance is: " + balance);
                } else {
                    System.out.println("No cigar, Try again!");
                }

            }

            //ask to play again
            System.out.print("Do you want to play again (yes or no)? ");
            playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("YES")) break;
        }

        System.out.println("Game over, your final balance is: $ " + balance);

        //exit
        scanner.close();
    }

    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍉" -> bet * 3;
                case "🫐" -> bet * 4;
                case "🍇" -> bet * 5;
                case "🍔" -> bet * 10;
                case "🍣" -> bet * 20;
                default -> 0;
            };
        } else if(row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍉" -> bet * 2;
                case "🫐" -> bet * 3;
                case "🍇" -> bet * 4;
                case "🍔" -> bet * 5;
                case "🍣" -> bet * 10;
                default -> 0;
            };
        } else if(row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍉" -> bet;
                case "🫐" -> bet * 2;
                case "🍇" -> bet * 3;
                case "🍔" -> bet * 4;
                case "🍣" -> bet * 8;
                default -> 0;
            };
        } else if(row[0].equals(row[2])) {
            return switch (row[1]) {
                case "🍉" -> bet * 2;
                case "🫐" -> bet * 3;
                case "🍇" -> bet * 4;
                case "🍔" -> bet * 5;
                case "🍣" -> bet * 9;
                default -> 0;
            };
        }
        return 0;
    }

    static String[] spinRow() {
        String[] symbols = {"🍉","🫐","🍇","🍔","🍣"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    static void printRow(String[] row) {
        System.out.println("*****************");
        System.out.println("  " + String.join(" | ", row) + " ");
        System.out.println("*****************");
    }
}
