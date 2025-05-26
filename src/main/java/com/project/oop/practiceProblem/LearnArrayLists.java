package com.project.oop.practiceProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class LearnArrayLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter the number of foods you'd like to store: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Food " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();
    }
}
