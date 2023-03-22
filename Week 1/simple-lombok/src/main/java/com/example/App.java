package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println("Create a new user to begin:");

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter your email address: ");
        String email = sc.next();

        System.out.print("Enter your contact number: ");
        long number = sc.nextLong();

        user us1 = new user(name, email, number); // use of allargsconstructor annotation
        System.out.println("1st User succesfully created!");

        App app = new App();
        app.displayUser(us1);

        user us2 = new user(); // use of noargsconstructor annotation

        us2.setName(name); // use of setters annotation
        us2.setEmail(email);
        us2.setContactNumber(number);

        System.out.println("2nd User succesfully created!");
        app.displayUser(us2);

    }

    public void displayUser(user us) {

        System.out.println("User details:");
        System.out.println("Name of the user: " + us.getName()); // use of getters annotation
        System.out.println("Email of the user: " + us.getEmail());
        System.out.println("Contact Number of the user: " + us.getContactNumber() + "\n");

    }
}
