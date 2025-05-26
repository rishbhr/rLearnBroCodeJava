package com.project.oop.understandingFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text to write to file: ");
        String inputText = scanner.nextLine();


        try (FileWriter writer = new FileWriter("test.txt")) {
            writer.write(inputText);
            System.out.println("File has been written");
        } catch (FileNotFoundException f) {
            System.out.println("Could not locate file location");
        } catch (IOException e) {
            System.out.println("File not written");
        }


    }
}
