package com.project.prelim;

public class PrintFormatting {
    public static void main(String[] args) {
        String name = "Spongebob";
        int age = 30;
        char firstLetter = 'S';
        double height = 60.5;
        boolean isEmployed = true;


        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with %c\n", firstLetter);
        System.out.printf("Your age is %d years old\n", age);
        System.out.printf("Your height is %f inches\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old and his first name starts with the letter %c and his height is %f.\n", name, age, firstLetter, height);

        //%[flags][width][.precision][specified-character]

        double price1 = 9000.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%(,+.2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%-4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);
    }
}
