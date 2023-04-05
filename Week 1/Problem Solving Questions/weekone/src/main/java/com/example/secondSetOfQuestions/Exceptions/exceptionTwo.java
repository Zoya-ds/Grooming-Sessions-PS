package com.example.secondSetOfQuestions.Exceptions;

import java.util.Scanner;

// we can create custom errors
// but cannot handle them
//comes under Iterable

public class exceptionTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter mobile number: ");
        long mobileNumber = 0;

        int flag = 0;

        if (name.isEmpty()) {
            flag++;
            throw new NameNotFoundException("Name not found");
        } else {
            System.out.println("Name: " + name);
        }

        String validMobile = String.valueOf(mobileNumber);

        if (validMobile.length() != 10) {
            flag++;
            throw new InvalidMobileNumberException("Mobile number must be of 10 digits");
        } else {
            System.out.println("Mobile Number: " + mobileNumber);
        }

        if (flag == 2)
            System.out.println("No info found!");
    }

}
