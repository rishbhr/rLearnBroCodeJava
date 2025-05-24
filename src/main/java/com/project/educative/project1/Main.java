package com.project.educative.project1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        String name;
        String answer;

        System.out.println("Educative game show");
        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.printf("Welcome %s Lets start the questions!\n", name);


        String[][] questions = {
                {"What is the difference between JDK, JRE, and JVM?", "JDK is the Java Development Kit, JRE is the Java Runtime Environment, and JVM is the Java Virtual Machine that runs Java bytecode."},
                {"What is the use of import statement?", "The import statement allows the use of classes from other packages."},
                {"What is throws keyword?", "The throw keyword is used to explicitly throw an exception."},
                {"What is the use of @RequestMapping?", "Maps HTTP requests to handler methods of MVC and REST controllers."},
                {"What is Spring Security?", "A module that handles authentication and authorization."}};

        for (String[] question : questions) {
            for (int j = 1; j < question.length; j++) {
                System.out.println("*************");
                System.out.println(question[0]);
                System.out.print("Answer: ");
                answer = scanner.nextLine();
                if (answer.contentEquals(question[j])) {
                    score += 1;
                    System.out.println("Correct!");
                    System.out.println("Next question");
                } else {
                    System.out.println("Wrong, next question!");
                }
            }
        }

        System.out.printf("Your final score is: %d!\n", score);

        scanner.close();
    }
}
