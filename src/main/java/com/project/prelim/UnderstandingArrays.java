package com.project.prelim;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {
        String[] fruits = {"apple", "mango", "grapes", "coconut", "banana"};

//        int numOfFruits = fruits.length;

//        System.out.println(numOfFruits);

//        Arrays.sort(fruits);
        Arrays.fill(fruits,"pineapple");

        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
