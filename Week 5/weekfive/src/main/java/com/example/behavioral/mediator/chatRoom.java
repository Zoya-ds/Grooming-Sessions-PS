package com.example.behavioral.mediator;

public class chatRoom {

    public static void showMessage(User user, String message) {
        System.out.println("[" + user.getName() + "]: " + message);
    }

}
