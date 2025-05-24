package com.project.prelim;

import java.util.Scanner;

public class MathFunctions {
    public static void main(String[] args) {
//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        double result;
//
//        result = Math.pow(2,5);
//        result = Math.abs(-5);
//        result = Math.sqrt(9);
//        result = Math.round(3.14);
//        result = Math.ceil(3.14);
//        result = Math.floor(3.99);
//        result = Math.max(10,20);
//        result = Math.min(10, 20);

//        System.out.println(result);

        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Lenght of c in a triangle.");
//
//        double a, b, c;
//
//        System.out.print("Enter length of side A: ");
//        a = scan.nextDouble();
//
//        System.out.print("Enter length of side B: ");
//        b = scan.nextDouble();
//
//        c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
//
//        System.out.println("Length of C is: " + c);


        System.out.println("Area of a circle");


        double area, circumference, radius, volume;
        System.out.print("Radius of the circle: ");
        radius = scan.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("Area is: %.1f\n", area);
        System.out.printf("Circumference is: %.1f\n", circumference);
        System.out.printf("Volume is: %.1f\n", volume);

        scan.close();
    }
}
