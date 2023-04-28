package com.example.creational.singleton;

public class firstSingleton {

    // eager initialization
    private static final firstSingleton instance = new firstSingleton();

    private firstSingleton() {
    }

    public static firstSingleton getInstance() {
        return instance;
    }
}
