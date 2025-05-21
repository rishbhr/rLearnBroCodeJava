package com.project;

import java.util.Scanner;

public class CompundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double finalAmount;

        System.out.print("Enter the principal amount:");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate:");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year:");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the number of years:");
        years = scanner.nextInt();

        finalAmount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is: $ %.2f ", years, finalAmount);

        scanner.close();
    }
}
