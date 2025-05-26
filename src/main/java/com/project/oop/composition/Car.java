package com.project.oop.composition;

public class Car {
    String model;
    int year;
    Engine engine;


    Car(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start() {
        this.engine.start();
        System.out.println("The " + this.model + " is running.");
    }

    //getters and setters
//    String getModel() {
//        return this.model;
//    }
//    int getYear() {
//        return this.year;
//    }
//    Engine getEngine() {
//        return this.engine;
//    }
//
//    void setModel(String model) {
//        this.model = model;
//    }
//
//    void setYear(int year) {
//        this.year = year;
//    }
//
//    void setEngine(Engine engineType) {
//        this.engine = engineType;
//    }
}
