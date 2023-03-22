package com.example;

public class quesTwo extends User {

    public static void main(String[] args) {

        User us = new User();

        System.out.println(us.firstName);
        System.out.println(us.email);
        // System.out.println(us.password); //program will not compile, because variable
        // cannot be accessed
    }
}
