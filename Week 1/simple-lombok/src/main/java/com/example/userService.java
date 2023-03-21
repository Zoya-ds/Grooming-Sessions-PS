package com.example;

import java.util.Scanner;

public class userService {

    public user createUser(String name, String email, long number) {

        user us = new user(name, email, number);

        System.out.println("User succesfully created!");
        return us;
    }

    public void displayUser(user us) {

        System.out.println("Name of the user: " + us.getName());
        System.out.println("Email of the user: " + us.getEmail());
        System.out.println("Contact Number of the user: " + us.getContactNumber() + "\n");

    }

    public void updateUserName(user us) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new name: ");
        String newName = sc.nextLine();

        us.setName(newName);

        System.out.println("Updation successful!");
        displayUser(us);
    }

    public void updateUserEmail(user us) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new email: ");
        String newEmail = sc.next();

        us.setEmail(newEmail);

        System.out.println("Updation successful!");
        displayUser(us);
    }

    public void updateUserContactNumber(user us) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new contact number: ");
        long newContactNumber = sc.nextLong();

        us.setContactNumber(newContactNumber);

        System.out.println("Updation successful!");
        displayUser(us);
    }

}
