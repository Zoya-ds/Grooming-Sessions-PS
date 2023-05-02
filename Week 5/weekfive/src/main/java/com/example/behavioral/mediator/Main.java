package com.example.behavioral.mediator;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("John");
        User user2 = new User("Jane");

        user1.sendMessage("Hello!");
        user2.sendMessage("Hi! John");
    }

}
