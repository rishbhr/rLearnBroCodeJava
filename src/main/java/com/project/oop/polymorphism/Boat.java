package com.project.oop.polymorphism;

public class Boat implements Vehicle {
    @Override
    public void go() {
        System.out.println("You sail the boat");
    }
}
