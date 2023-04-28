package com.example.creational.singleton;

public class lazySingleton {

    private static lazySingleton instance;

    private lazySingleton() {
    }

    public static lazySingleton getInstance() {
        if (instance == null) {
            instance = new lazySingleton(); // problem in multi-threaded environments
        }
        return instance;
    }
}
