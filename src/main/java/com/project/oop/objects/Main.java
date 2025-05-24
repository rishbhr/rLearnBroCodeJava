package com.project.oop.objects;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);

        car.drive();
        car.brake();

        System.out.println(car.make + " " + car.model);
        System.out.println(car1.make + " " + car1.model);
    }


}
