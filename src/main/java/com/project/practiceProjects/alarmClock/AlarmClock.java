package com.project.practiceProjects.alarmClock;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;


public class AlarmClock implements Runnable {
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    public AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                LocalTime currentTime = LocalTime.now();
                Thread.sleep(1000);

                System.out.printf("\r%02d:%02d:%02d",
                        currentTime.getHour(),
                        currentTime.getMinute(),
                        currentTime.getSecond());

            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        System.out.println("\nAlarm ringing! Time to wake up!");
        playSound(filePath);
    }

    private void playSound(String filePath) {
        File audioFile = new File(filePath);

        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            System.out.print("Press enter to stop the alarm!");
            scanner.nextLine();
            clip.stop();

            scanner.close();
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format not supported");
        } catch (IOException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }


    }

}
