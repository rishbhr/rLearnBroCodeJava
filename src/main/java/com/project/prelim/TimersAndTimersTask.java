package com.project.prelim;

import java.util.Timer;
import java.util.TimerTask;

public class TimersAndTimersTask {
    // Timer class that schedules tasks at specific time or periodically
    //       useful for: sending notifications, scheduled updates, repetitive actions
    // TimerTask represents task that will be executed the timer
    //           you will extend the TimerSpeak class to define your task using anonymous classes
    //           create a subclass of TimerTask and @Override run()

    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello");
                count--;
                if (count <= 0) {
                    System.out.println("Task is complete");
                    timer.cancel();
                }

            }
        };

        timer.schedule(task, 500, 1000);


    }


}
