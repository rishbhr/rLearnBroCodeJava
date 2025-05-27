package com.project.prelim;

import java.util.ArrayList;

public class UnderstandGenerics {
    public static void main(String[] args) {
        // Generics
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Hello");
        myList.add("How are you?");
        myList.add("Goodbye!");

        // define type argument when creating the object
        Box<String> box = new Box<>();
        box.setItem("banana");
        System.out.println(box.getItem());


        // Two generic types
        Product<String, Double> product = new Product<>("Airpods", 249.99);
        Product<String, Double> product1 = new Product<>("Movie Tickets", 21.99);

        System.out.println(product.getItem() + " " + product.getPrice());
        System.out.println(product1.getItem() + " " + product1.getPrice() );


    }
}

class Box<T> {
    T item;

    public void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return this.item;
    }

}

class Product<T, U> {
    private T item;
    private U price;

    Product(T item, U price) {
        this.item = item;
        this.price = price;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void setPrice(U price) {
        this.price = price;
    }

    T getItem() {
        return this.item;
    }

    U getPrice() {
        return this.price;
    }


}
