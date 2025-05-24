package com.project.prelim;

public class TelephonePad {
    public static void main(String[] args) {
        char[][] pad = {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };

        for (char[] row : pad) {
            for (char number : row) {
                System.out.print(number);
            }
            System.out.println();
        }


    }
}
