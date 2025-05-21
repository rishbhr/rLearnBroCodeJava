package com.project;

import java.util.Scanner;
import java.util.TreeMap;

public class Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(square(3));
        System.out.println(cube(3));
        System.out.println(getFullName("Rishi", "Rana"));

        int age = 12;
        if (ageCheck(age)) {
            System.out.println("You can sign up!");
        } else {
            System.out.println("You must be 18 to sign up!");
        }

        scanner.close();
    }

    static void singHappybirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday to you!");
        System.out.println("Happy Birthday dear " + name + "!");
        System.out.printf("You are %d years old!\n", age);
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
