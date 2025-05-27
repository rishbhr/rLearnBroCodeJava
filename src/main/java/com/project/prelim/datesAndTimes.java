package com.project.prelim;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datesAndTimes {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        Instant instant = Instant.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);
        System.out.println(instant);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        System.out.println(dateTime.format(dateTimeFormatter));

        LocalDate date1 = LocalDate.of(2024, 12, 25);
        System.out.println(date1);


        LocalDateTime dateTime1 = LocalDateTime.of(2025, 12, 25, 12, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);

        if (dateTime1.isBefore(dateTime2)) {
            System.out.println(dateTime1 + " is before date 2");
        } else if (dateTime2.isBefore(dateTime1)) {
            System.out.println(dateTime2 + " is before date 1");
        } else if (dateTime1.equals(dateTime2)) {
            System.out.println("The dates are the same");
        }


    }


}
