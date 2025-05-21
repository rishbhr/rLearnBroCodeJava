package com.project;

public class StringMethods {
    public static void main(String[] args) {
        String name = "    Rishbh Rana   ";
        int name_length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("h");
        int lastIndex = name.lastIndexOf("a");

        name = name.toUpperCase();
        name = name.trim();
        String name3 = name.replace("H", "a");




        System.out.println(name);
        System.out.println(name_length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name3);


        System.out.println(name.isEmpty());
        System.out.println(name.contains(" "));
        System.out.println(name.equals(name3));
        System.out.println(name.equalsIgnoreCase(name3));


    }
}
