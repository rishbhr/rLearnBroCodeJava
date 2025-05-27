package com.project.oop.anonClasses;

public class Main {
    public static void main(String[] args) {
// alot of work to create new class for a single object
//        TalkingDog talkingDog = new TalkingDog();
//        talkingDog.speak();

        Dog dog = new Dog();
        Dog dog1 = new Dog() {
            // anonymous class
            @Override
            void speak() {
                System.out.println("Scooby Doo says, RuhRoh!");
            }
        };

        dog.speak();
        dog1.speak();


    }
}
