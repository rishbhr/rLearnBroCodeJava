package com.project.oop.superConstructors;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sevarus", "Snape");
        Student student1 = new Student("Harry", "Potter", 3.0);
        Employee employee1 = new Employee("Prof", "Hagrid", 5000);

        person.showName();
        student1.showName();

        student1.showGpa();
        employee1.showSalary();

    }
}
