package com.project.prelim;

public class OverloadedMethods {
    public static void main(String[] args) {
        String pizza = bakePizza("flat bread");
        System.out.println(pizza);

        System.out.println(bakePizza("pan", "mozzarella"));
        System.out.println(bakePizza("pan", "mozzarella", "mushrooms"));
    }

    static String bakePizza(String bread) {
        return bread + " pizza";
    }

    static String bakePizza(String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }

    static String bakePizza(String bread, String cheese, String topping) {
        return topping + " with " + cheese + " " + bread + " pizza";
    }
}
