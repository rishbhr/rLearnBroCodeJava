package com.project;

public class TwoDArrays {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};
        String[] vegetables = {"Squash", "Eggplant", "Onion", "Potato"};
        String[] cheese = {"Mozzarella", "Chedder", "Brie", "Provolone"};

//        String[][] groceries = {
//                {"Apple", "Orange", "+Banana", "Coconut"},
//                {"Squash", "Eggplant", "Onion", "Potato"},
//                {"Mozzarella", "Chedder", "Brie", "Provolone"}
//        };

        String[][] groceries = {fruits, vegetables, cheese};

        groceries[1][0] = "Celery";
        groceries[1][3] = "Carrot";

        for(String[] foods : groceries) {
            for(String food: foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }


}
