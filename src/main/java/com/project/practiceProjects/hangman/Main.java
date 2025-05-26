package com.project.practiceProjects.hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "words.txt";

        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }


        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));



        int wrongGuess = 0;
        ArrayList<Character> wordState = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
              wordState.add('_');
        }

        System.out.println("**************************");
        System.out.println(" Welcome to java hangman!");
        System.out.println("**************************");

        while (wrongGuess < 6) {
            System.out.println(getHangmanArt(wrongGuess));
            System.out.print("Word: ");

            for (char letter : wordState) {
                System.out.print(letter + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess!");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }

                if (!wordState.contains('_')) {
                    System.out.println("You win!");
                    System.out.println(getHangmanArt(wrongGuess));
                    System.out.println("The word was: " + word);
                    break;
                }


            } else {
                System.out.println("Wrong guess!");
                wrongGuess++;
            }
        }

        if (wrongGuess >= 6) {
            System.out.println("Game Over!");
            System.out.println(getHangmanArt(wrongGuess));
            System.out.println("The word was: " + word);
        }



        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
        case 0 -> """
                  
                  
                  
                  """;
        case 1 -> """
                   O
                  
                  
                  """;
        case 2 -> """
                   O
                   |
                  
                  """;
        case 3 -> """
                   O
                  /|
                  
                  """;
        case 4 -> """
                   O
                  /|\\ 
                  
                  """;
        case 5 -> """
                   O
                  /|\\
                  /
                  """;
        case 6 -> """
                   O
                  /|\\
                  / \\
                  """;
        default -> "";
        };
    }
}
