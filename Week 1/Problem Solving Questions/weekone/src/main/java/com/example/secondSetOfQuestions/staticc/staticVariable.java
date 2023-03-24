package com.example.secondSetOfQuestions.staticc;

public class staticVariable {

    static int count = 0;
    int flag = 0;

    static {
        System.out.println("Begin your counter!");
    }

    public void counter() {
        count++;
        flag++;
        System.out.println("Current Value: " + count);
        System.out.println("Flag value: " + flag);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {

        staticVariable s1Method = new staticVariable();
        s1Method.counter();
        s1Method.counter();

        staticVariable s2Method = new staticVariable();
        s2Method.counter(); // count=3 because it is a static variable

    }

}
