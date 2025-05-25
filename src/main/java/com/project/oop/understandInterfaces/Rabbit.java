package com.project.oop.understandInterfaces;

public class Rabbit implements Prey {

    @Override
    public void flee() {
        System.out.println("*The rabbit is running away*");
    }
}
