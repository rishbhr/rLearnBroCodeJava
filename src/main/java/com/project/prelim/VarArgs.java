package com.project.prelim;

public class VarArgs {
    public static void main(String[] args) {


        System.out.println("Sum " + add(1, 0, 3, 2));

        System.out.println("Average: " + average(4, 5, 6, 7, 2, 10, 14, 3));

    }

    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    static int average(int... numbers) {
        int sum = 0;

        if (numbers.length == 0) {return 0; };

        for (int number : numbers) {
            sum += number;
        }

        return sum/numbers.length;
    }
}
