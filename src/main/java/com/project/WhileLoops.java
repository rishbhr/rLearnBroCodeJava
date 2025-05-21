package com.project;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        String response = "";
//
//        while(!response.equals("Q")) {
//            System.out.print("You are playing a game, press q to quit ");
//            response = scanner.next().toUpperCase();
//        }
//
//        System.out.print("You have quit the game");

//        int age;
//        do {
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        } while (age < 0);
//
//        System.out.println("You are " + age + " years old.");

        int num = 0;

        do {
            System.out.print("Enter a number between 1-10: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 10);

        System.out.print("You picked " + num);



        scanner.close();
    }



}
