package com.example.secondSetOfQuestions.staticc;

public class staticClass {

    String message;
    static String user = " Zoya";

    class userOne {

        void displayMessage() {
            message = "Welcome";
            System.out.println(message);
        }

        void displayUser() {
            System.out.println("User One: " + user);
        }
    }

    static class userTwo {

        // Cannot access non-static member 'message'
        // void displayMessage() {
        // message = "Greetings";
        // System.out.println(message);
        // }

        void displayUser() {
            System.out.println("User two: " + user);
        }
    }

    public static void main(String[] args) {
        // Ask
        // userOne uOne= new userOne();

        staticClass.userTwo uTwo = new staticClass.userTwo();
        uTwo.displayUser();

        // staticClass.userOne uOne = new staticClass.userOne();
        staticClass sClass = new staticClass();
        staticClass.userOne uOne = sClass.new userOne();
        uOne.displayMessage();
        uOne.displayUser();
    }

}
