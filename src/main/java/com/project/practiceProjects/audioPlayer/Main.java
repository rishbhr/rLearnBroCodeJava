package com.project.practiceProjects.audioPlayer;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static com.project.prelim.Banking.scanner;

public class Main {
    public static void main(String[] args) {
        // free from youtube music library
        String filePath = "Boomin' - Dan _Lebo_ Lebowitz, Tone Seeker.wav";

        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in); AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String reponse = "";

            while (!reponse.equals("Q")) {
                System.out.println("P = play");
                System.out.println("S = stop");
                System.out.println("R = reset");
                System.out.println("Q = quit");
                System.out.print("Enter your choice: ");

                reponse = scanner.next().toUpperCase();

                switch (reponse) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Cloud not locate file");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Not a supported format");
        } catch (LineUnavailableException e) {
            System.out.println("Could not access file");
        } catch (IOException e) {
            System.out.println("Something else went wrong");
        } finally {
            System.out.println("Bye!");
        }
    }
}
