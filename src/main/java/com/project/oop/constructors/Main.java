package com.project.oop.constructors;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Spongebob",30, 4.0, true);
        Student student2 = new Student("Patrick", 32, 2.0, true);
        Student student3 = new Student("Sandy", 28, 4.5, true);

//        System.out.println(student1.name);
//        System.out.println(student1.age);
//        System.out.println(student1.gpa);
//
//        System.out.println(student2.name);
//        System.out.println(student2.age);
//        System.out.println(student2.gpa);
//
//        System.out.println(student3.name);
//        System.out.println(student3.age);
//        System.out.println(student3.gpa);


        student3.study();
    }
}
