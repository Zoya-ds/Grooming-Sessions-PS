//How will you create a task & execute it - Multiple tasks 
package com.example.threads;

public class createMultiTasks {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new TaskOne());
        Thread threadTwo = new Thread(new TaskTwo());

        threadOne.start();
        threadTwo.start();
    }
}

class TaskOne implements Runnable {

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

class TaskTwo implements Runnable {

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