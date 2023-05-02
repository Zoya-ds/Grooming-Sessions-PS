package com.example.structural.adapter;

public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Flying sparrow");
    }

    @Override
    public void speak() {
        System.out.println("Chirp chirp");
    }

}
