package com.project.oop.understandingFiles;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args) {
        String filePath = "test.txt";


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("Found file  ");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not locate file");
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }

    }
}
