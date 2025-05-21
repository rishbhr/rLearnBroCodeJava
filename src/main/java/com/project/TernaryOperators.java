package com.project;

import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scan.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(evenOrOdd);


        System.out.println("Enter income: ");
        int income = scan.nextInt();

        double taxRate = (income >= 40000) ? 0.25 : 0.15;

        System.out.println(taxRate);

        scan.close();
    }
}
