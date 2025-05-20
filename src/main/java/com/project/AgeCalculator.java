package com.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        int age;
        boolean is_student;

        System.out.print("Enter your name: ");
        name = scan.nextLine();

        System.out.print("Enter your age: ");
        age = scan.nextInt();

        System.out.print("Are you a student (enter true/false): ");
        is_student = scan.nextBoolean();

        if (name.isEmpty()) {
            System.out.println("You didnt enter your name! 😡");
        } else {
            System.out.println("Hello, " + name + "!");
        }

        if (age <= 0) {
            System.out.println("youre not born yet 🧖🏽");
        } else if ( age <= 10) {
            System.out.println("you are a child 👶");
        } else if ( age <= 19) {
            System.out.println("you are a teen");
        } else if (age <= 65) {
            System.out.println("you are a adult");
        } else {
            System.out.println("you are a senior");
        }

        if (is_student) {
            System.out.println("You are a student");
        } else {
            System.out.println("You are not a student");
        }


        scan.close();
    }

}
