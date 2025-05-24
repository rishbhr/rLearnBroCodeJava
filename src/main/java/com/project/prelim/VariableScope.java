package com.project.prelim;

public class VariableScope {

    static int x = 3; //CLASS scope


    public static void main(String[] args) {
        System.out.println(x);

        doSomething();
    }

    static void doSomething() {
        System.out.println(x);
    }
}
