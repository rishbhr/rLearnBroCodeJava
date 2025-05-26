package com.project.oop.aggregateObjects;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Fellowship of the Ring", 423);
        Book book2 = new Book("The two towers", 323);
        Book book3 = new Book("The return of a king", 416);

        Book[] books = {book1, book2, book3};

        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();



    }
}
