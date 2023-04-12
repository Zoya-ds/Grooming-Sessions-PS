package com.example.threads.tasks;

public class TaskTwo implements Runnable {

    @Override
    public void run() {
        // prints even numbers from 0 to 10
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i + " " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}