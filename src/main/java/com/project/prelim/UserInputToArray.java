package com.project.prelim;

import java.util.Scanner;

public class UserInputToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of foods: ");
        int numberOfFoods = scanner.nextInt();
        scanner.nextLine();
        String[] foods = new String[numberOfFoods];

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            String food = scanner.nextLine();
            foods[i] = food;
        }

        for (String food : foods) {
            System.out.println(food);

        }
    }
}
