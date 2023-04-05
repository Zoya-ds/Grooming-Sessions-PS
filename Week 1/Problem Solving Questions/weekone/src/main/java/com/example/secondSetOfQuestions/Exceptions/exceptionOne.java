package com.example.secondSetOfQuestions.Exceptions;

import java.util.Scanner;

public class exceptionOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();

        int quotient = 0;
        try {
            quotient = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
            // System.error();
        } finally {
            sc.close();
            System.out.println("Done..");
        }

        System.out.println("Quotient: " + quotient);

    }

}
