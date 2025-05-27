package com.project.oop.DataStructures;

import java.util.HashMap;
import java.util.LinkedList;

public class UnderstandHashMaps {
    public static void main(String[] args) {
        //HashMap = A data structure that stores key-value pairs
        //          Keys are unique, but Values can be duplicated
        //          Does not maintain any order, but is memory efficient
        //          HashMap<Key, Value>

        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Apples", 4);
        inventory.put("Oranges", 5);
        inventory.put("Bananas", 3);
        inventory.put("Coconut", 20);

        if (inventory.containsKey("Pineapple")) {
            System.out.println(inventory.get("Pineapple"));
        } else {
            System.out.println("Key not found");
        }

        System.out.println("We have 5 of oranges? " + inventory.containsValue(5));
        System.out.println(inventory.size());


        for (String key : inventory.keySet()) {
            System.out.println(key + " " + inventory.get(key));
        }


    }
}
