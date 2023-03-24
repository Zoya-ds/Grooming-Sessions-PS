package com.example.secondSetOfQuestions.constructors;

public class parameterizedConstructor {

    int num;
    String name;

    public parameterizedConstructor(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public static void main(String[] args) {

        parameterizedConstructor obj1 = new parameterizedConstructor(11, "Publicis Sapient");
        System.out.println("Num: " + obj1.num);
        System.out.println("Name: " + obj1.name);

    }

}
