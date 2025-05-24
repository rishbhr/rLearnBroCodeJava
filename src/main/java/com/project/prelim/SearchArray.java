package com.project.prelim;

import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] numbers = {1, 4, 6, 8, 3, 2};
        String[] fruits = {"apple", "orange", "banana"};
        boolean isFound = false;

        System.out.print("Enter fruit you want to find: ");
        String target = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound) {
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }
}
