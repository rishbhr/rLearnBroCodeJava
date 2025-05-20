package com.project;

import java.util.Random;

public class Examples {

    public static void main(String[] args) {
        Random random = new Random();

        int number1;
        double number2;
        boolean heads_or_tails;

        number1 = random.nextInt(1, 101);
        number2 = random.nextDouble();
        heads_or_tails = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(heads_or_tails);
    }

}
