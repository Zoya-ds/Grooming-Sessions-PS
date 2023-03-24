package com.example.secondSetOfQuestions.staticc;

public class staticInitializer {

    static int[] array = new int[5];

    static {

        System.out.println("Running static initialization block.");

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (100 * Math.random());
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        System.out.println("Main block running");

    }
}
