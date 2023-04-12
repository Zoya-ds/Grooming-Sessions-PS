package com.example.threads.tasks;

public class TaskOne implements Runnable {

    @Override
    public void run() {
        // prints numbers from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
