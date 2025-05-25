package com.project.oop.dynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you a like a dog or a cat? 1. Dog or 2. Cat: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }




        scanner.close();
    }
}
