package com.project.prelim;

public class ConditialLogic {
    public static void main(String[] args) {
        boolean isStudent = true; // 10%
        boolean isSenior = true; // 20%
        double price = 9.99;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                System.out.println("You get a student discount of 10%");
                price *= 0.8;
                price *= 0.9;
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You get a discount of 20%");
                price *= 0.8;
            }
        }

        System.out.printf("Price of the ticket is: $%.2f", price);
    }


}
