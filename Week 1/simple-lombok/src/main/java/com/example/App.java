package com.example;

import java.util.Scanner;
import com.example.userService;

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

        userService userService = new userService();
        user us1 = userService.createUser(name, email, number);

        System.out.println("Welcome " + us1.getName().split(" ")[0] + "! Choose an option to proceed:");
        boolean start = true;
        while (start) {

            System.out.println("1. Display user info");
            System.out.println("2. Update user info");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    userService.displayUser(us1);
                    break;
                case 2:
                    int flag = 99;
                    System.out.println("Welcome to the update menu!");
                    while (flag != 0) {
                        System.out.println("1. Update your name");
                        System.out.println("2. Update your email");
                        System.out.println("3. Update your contact number");
                        System.out.println("4. Go back to previous menu");

                        int ch = sc.nextInt();
                        switch (ch) {
                            case 1:
                                userService.updateUserName(us1);
                                break;
                            case 2:
                                userService.updateUserEmail(us1);
                                break;
                            case 3:
                                userService.updateUserContactNumber(us1);
                                break;
                            case 4:
                                flag = 0;
                                break;
                            default:
                                System.out.println("Invalid choice1");
                        }
                    }
                    break;
                case 3:
                    start = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
