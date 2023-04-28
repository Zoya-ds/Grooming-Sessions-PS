package com.example.creational.singleton;

public class threadSafeSingleton {

    private static threadSafeSingleton instance;

    private threadSafeSingleton() {
    }

    public static synchronized threadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new threadSafeSingleton();
        }
        return instance;
    }
}
