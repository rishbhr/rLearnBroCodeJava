package com.project.oop.arrayOfObjects;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car("Mustang", "Yellow");
//        Car car1 = new Car("M3", "White");
//        Car car2 = new Car("F40", "Red");

        Car[] cars = {new Car("Mustang", "Yellow"),
                      new Car("M3", "White"),
                      new Car("F40", "Red")};

        for (Car value : cars) {
            value.color = "black";
            value.drive();
        }
    }


}
