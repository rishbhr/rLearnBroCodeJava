package com.project.prelim;

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        double weight;
        double newWeight;

        System.out.print("1. LBS to KGS or 2. KGS to LBS");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter initial weight: ");
            weight = scanner.nextDouble();
            newWeight = weight*0.453952;
            System.out.printf("%.2f lbs in kgs is %.2f\n", weight, newWeight);

        } else if (choice == 2) {
            System.out.print("Enter initial weight: ");
            weight = scanner.nextDouble();
            newWeight = weight*2.20462;
            System.out.printf("%.2f kgs in lbs is %.2f", weight, newWeight);
        } else {
            System.out.println("Not a valid choice");
        }
    }
}
