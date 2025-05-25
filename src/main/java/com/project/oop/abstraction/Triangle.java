package com.project.oop.abstraction;

public class Triangle extends Shape {
    double base, height;

    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}
