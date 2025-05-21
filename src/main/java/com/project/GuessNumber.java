package com.project;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int  attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);

        System.out.println("Number guessing game! ");
        System.out.printf("Guess a number between %d and %d!\n", min, max);

        do {
            System.out.print("Guess number: ");
            guess = scanner.nextInt();
            attempts += 1;

            if (guess < randomNumber) {
                System.out.println("Too low, try again");
            } else if (guess > randomNumber) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Correct! The number was: " + randomNumber);
                System.out.println("It took you " + attempts + " tries to guess the number.\n");
            }

        } while (guess != randomNumber);

        scanner.close();
    }
}
