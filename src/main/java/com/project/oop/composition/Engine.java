package com.project.oop.composition;

public class Engine {
    String cylinder;

    Engine(String cylinder) {
        this.cylinder = cylinder;
    }

    void start() {
        System.out.println("You start the " + this.cylinder + " engine.");
    }
}
