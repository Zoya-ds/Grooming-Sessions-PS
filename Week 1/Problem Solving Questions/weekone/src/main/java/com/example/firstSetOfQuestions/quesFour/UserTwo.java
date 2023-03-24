package com.example.firstSetOfQuestions.quesFour;

public class UserTwo extends User {

    void Name() {
        System.out.println("Method overridden...");
    }

    void Show(int num) {
        System.out.println("Method overloading 1...");
        System.out.println(num);
    }

    void Show(String name) {
        System.out.println("Method overloading 2...");
        System.out.println(name);
    }

}
