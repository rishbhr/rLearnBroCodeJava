package com.project.prelim;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        //variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberOfDice,  total = 0;

        // get dice from user
        System.out.print("Enter number of dice: ");
        numberOfDice = scanner.nextInt();


        // check if number of dice is > 0
        if (numberOfDice > 0) {
            System.out.println("You roll the dice");

            for(int i = 0; i < numberOfDice; i++) {
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("With a total of: " + total);
        } else {
            System.out.println("Number of dice must be greater than 0.");
        }
    }

    // display ascii art
    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |   •   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | •     |
                |       |
                |     • |
                 -------
                """;
        String dice3 = """
                 -------
                | •     |
                |   •   |
                |     • |
                 -------
                """;
        String dice4 = """
                 -------
                | •   • |
                |       |
                | •   • |
                 -------
                """;
        String dice5 = """
                 -------
                | •   • |
                |   •   |
                | •   • |
                 -------
                """;
        String dice6 = """
                 -------
                | •   • |
                | •   • |
                | •   • |
                 ---`----
                """;

        switch (roll) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}
