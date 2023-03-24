package com.example.firstSetOfQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class quesSix {

    public static void main(String[] args) {

        int arr[] = { 2, 4, 1, 8, 6, 0 };

        int l = arr.length;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("kth smallest: " + arr[k - 1]);
        System.out.println("kth Largest: " + arr[l - k]);

        sc.close();
    }

}
