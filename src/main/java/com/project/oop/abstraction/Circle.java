package com.project.oop.abstraction;

public class Circle extends Shape{

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

}
