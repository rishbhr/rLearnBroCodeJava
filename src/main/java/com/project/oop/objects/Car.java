package com.project.oop.objects;

public class Car {
    String make = "Ford";
    String model = "Mustang";

    int year = 2025;
    double price = 52829.55;
    boolean isRunning = false;


    void start() {
        System.out.println("You start the engine");
        isRunning = true;
    }

    void stop() {
        System.out.println("You stop the engine");
        isRunning = false;
    }

    void drive() {
        System.out.println("You drive the " + model);
    }

    void brake() {
        System.out.println("You brake the " + model);
    }

}
