package com.example.secondSetOfQuestions.constructors;

public class noArgsConstructor {

    int num;
    String name;

    public noArgsConstructor() {
        num = 2;
        name = "Zoya";
    }

    public static void main(String[] args) {

        noArgsConstructor obj1 = new noArgsConstructor();
        System.out.println("Num: " + obj1.num);
        System.out.println("Name: " + obj1.name);
    }

}
