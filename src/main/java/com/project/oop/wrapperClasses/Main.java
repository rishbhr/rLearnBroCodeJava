package com.project.oop.wrapperClasses;

import com.project.oop.aggregateObjects.Book;

public class Main {
    public static void main(String[] args) {

        // convert primitive types to be useful for collections,
        // preference is to use primitive types but specify utility methods
        // Autoboxing
        Integer a = 123;
        Double b = 3.14;

        // Unboxing
        int x = a;
        double y = b;


//        System.out.println((byte) x);
//        System.out.println((short) y);


        String aa = Integer.toString(a);
        String bb = Double.toString(y);


//        System.out.println(aa + " double  " + bb);

        int cc = Integer.parseInt("123");
        double dd = Double.parseDouble("4.45");
        char ee = "Pizza".charAt(0);
        boolean ff = Boolean.parseBoolean("False");





    }
}
