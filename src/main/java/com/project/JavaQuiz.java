package com.project;

import java.util.Scanner;

public class JavaQuiz {
    public static void main(String[] args) {
        // variables
        // questions array[]
        String[] questions = {
                "In the context of the Java Memory Model (JMM), what does the volatile keyword guarantee for a variable?",
                "What is the main difference between a PhantomReference and a WeakReference in Java?",
                "When using Java's ForkJoinPool, what does the work stealing algorithm accomplish?",
                "In Java's ClassLoader mechanism, what is parent delegation and why is it used?",
                "What JVM flag would you use to analyze garbage collection behavior in a production system?"
        };

        // options array[][]
        String[][] options = {
                {"1. Atomicity of compound actions like increment or decrement", "2. Thread-local visibility across synchronized blocks", "3. Visibility of changes to variables across threads", "4. Prevention of out-of-order execution by the JIT compiler only"},
                {"1. Phantom references can be dereferenced; weak references cannot", "2. Weak references are cleared before finalization; phantom references are enqueued after finalization", "3. Phantom references are stronger than weak references", "4. Both references are treated the same by the garbage collector"},
                {"1. It prioritizes threads based on CPU affinity", "2. It moves tasks from overloaded threads to idle ones", "3. It dynamically resizes the thread pool", "4. It serializes concurrent task execution for consistency"},
                {"1. It improves classloading performance by allowing parallel resolution", "2. It prevents overriding core Java classes by custom loaders", "3. It ensures each class is loaded only once across JVMs", "4. It supports multi-release JARs across different runtime versions"},
                {"1. -XX:+TraceClassUnloading", "2. -XX:+PrintGCDetails", "3. -Xnoclassgc", "4. -XX:+UseStringDeduplication"}
        };

        int[] answers = {3, 2, 2, 2, 2};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);



        // Welcome
        System.out.println("*************************************");
        System.out.println("Welcome to the Java quiz game!");
        System.out.println("*************************************");
        // Question (loop)
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                score++;
                System.out.println("*********");
                System.out.println("Correct");
                System.out.println("*********");
            } else {
                System.out.println("*********");
                System.out.println("Wrong");
                System.out.println("*********");
            }
        }


        //  options
        //  get guess from user
        //  check our guess
        // Display final score
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
