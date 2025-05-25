package com.project.oop.gettersAndSetters;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW M3", "White", 50000);

        car.setColor("Blue");
        car.setPrice(30000);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
