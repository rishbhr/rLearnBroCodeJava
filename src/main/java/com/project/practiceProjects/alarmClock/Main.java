package com.project.practiceProjects.alarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java Alarm Clock
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "Boomin' - Dan _Lebo_ Lebowitz, Tone Seeker.wav";

        while (alarmTime == null) {
            try {
                System.out.print("Enter an alarm time (HH:mm:ss): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for: " + alarmTime);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid format, please use HH:mm:ss");
            }
        }

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
