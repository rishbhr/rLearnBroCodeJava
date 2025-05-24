package com.project.prelim;

import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temp, newTemp;
        String unit;


        System.out.print("Enter temperature: ");
        temp = scan.nextDouble();

        System.out.print("Convert to c or f (C or F): ");
        unit = scan.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9);

        System.out.printf("%.1f %s", newTemp, unit);



        scan.close();
    }
}
