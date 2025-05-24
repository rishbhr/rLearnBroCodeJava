package com.project.oop.understandStatic;

public class Friend {
    String name;
    static int numOfFriends;

   Friend(String name) {
       this.name = name;
       numOfFriends++;
   }


   static void showFriends() {
       System.out.println("You have " + numOfFriends + " total friends.");
   }
}
