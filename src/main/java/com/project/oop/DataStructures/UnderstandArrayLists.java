package com.project.oop.DataStructures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UnderstandArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> listOfInts = new ArrayList<>();

        listOfInts.add(5);
        listOfInts.add(9);
        listOfInts.add(12);
        listOfInts.add(1);
        listOfInts.add(2);

        System.out.println(listOfInts.size());
        System.out.println(listOfInts);

        listOfInts.remove(1);

        System.out.println("After remove " + listOfInts.size());
        System.out.println(listOfInts);


        Collections.sort(listOfInts);

        System.out.println(listOfInts);
        System.out.println("**************************");

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Orange");
        fruits.add("Coconut");
        fruits.add("Pears");
        fruits.add("Banana");
        System.out.println(fruits);

        fruits.remove(3);
        System.out.println(fruits);

        fruits.set(0, "Pineapple");
        System.out.println(fruits);

        System.out.println(fruits.get(2));

        Collections.shuffle(fruits);
        System.out.println(fruits);

        Collections.sort(fruits);
        System.out.println(fruits);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }






    }
}
