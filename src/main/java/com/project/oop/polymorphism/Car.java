package com.project.oop.polymorphism;

public class Car implements Vehicle {

    @Override
    public void go() {
        System.out.println("You drive the car");
    }
}
