package com.project.oop.writingToFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write("I like party!");
            System.out.println("File has been written");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
