package com.example.secondSetOfQuestions.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionOne {

    public static void main(String[] args) {

        int quotient = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter 1st number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter 2nd number: ");
            int num2 = sc.nextInt();

            quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            // e.printStackTrace();
            // System.error();
        } catch (InputMismatchException e) {
            System.out.println("Invalid Input!");
        } finally {
            sc.close();
            System.out.println("Done..");
        }

    }

}
