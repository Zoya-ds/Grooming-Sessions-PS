package com.example.firstSetOfQuestions;

public class quesTwo {

    public static void main(String[] args) {

        User us = new User();

        System.out.println(us.firstName);
        System.out.println(us.email);
        // System.out.println(us.password); //error because variable cannot be accessed

        System.out.println(us.getPassword());

        us.setPassword("new564");
        System.out.println(us.getPassword());
    }
}
