package com.project.oop.composition;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.engine.cylinder + " " + car.year + " " + car.model);

        car.start();
    }
}
