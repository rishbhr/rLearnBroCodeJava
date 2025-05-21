package com.project;

public class Practice extends Thread implements Runnable {
    public void run(){
        System.out.printf("Educative ");
    }
    public static void main(String[] args) throws InterruptedException{
        Practice obj = new Practice();
        obj.run();
        obj.start();
    }
}
