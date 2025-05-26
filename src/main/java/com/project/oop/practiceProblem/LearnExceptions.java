package com.project.oop.practiceProblem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnExceptions {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            System.out.println(12 / number);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0? Breh");
        } catch (InputMismatchException i) {
            System.out.println("Please enter a number only");
        } finally { // optional
            System.out.println("this always runs");
        }
    }
}
