package com.example.secondSetOfQuestions.Exceptions;

import java.util.Scanner;

import com.example.firstSetOfQuestions.quesOne;

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
        }

        System.out.println("Quotient: " + quotient);

    }

}
