package com.project.prelim;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        String playerChoice, computerChoice;
        String playAgain = "yes";

        do {
            System.out.print("Enter your move(Rock, Paper, Scissors): ");

            // get choice from user
            playerChoice = scanner.nextLine();
            if (
                !playerChoice.equals("Rock") &&
                !playerChoice.equals("Paper") &&
                !playerChoice.equals("Scissors")
            ) {
                System.out.println("Invalid Choice!");
                continue;
            }

            // get random choice from computer
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);


            // check win condition
            if (playerChoice.equals(computerChoice)) {
                System.out.println("Its a tie!");
            } else if (
                (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))
            ) {
                System.out.println("You win!");

            } else {
                System.out.println("You loose!");
            }


            // play again?
            System.out.print("Play again(yes or no)? ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        // goodbye message
        System.out.println("Goodbye!");

        scanner.close();
    }
}
