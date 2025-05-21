package com.project;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
//        for ( int i = 10; i > 0; i-- ) {
//            System.out.println(i);
//        }

//        for (int i = 10; i > 0; i-=2) {
//            System.out.println(i);
//        }


        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter how many times you want to loop");
//        int max = scanner.nextInt();
//
//        for (int i = 1; i <= max; i++) {
//            System.out.println(i);
//        }


//        System.out.print("From where to count down: ");
//        int start = scanner.nextInt();
//
//        for(int i = start; i > 0; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//
//        System.out.println("Happy New Year!");

        // break(stop) and continue (skip)
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        scanner.close();


    }


}
