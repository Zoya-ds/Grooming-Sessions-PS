package com.example.firstSetOfQuestions;

import java.util.Scanner;

public class quesOne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        // double num1 = Integer.parseInt(args[0]);
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        // double num2 = Integer.parseInt(args[1]);
        double sum = num1 + num2;
        System.out.println("Sum of given two numbers: " + sum);

        sc.close();
    }
}