//1.	Write a program to create Thread using Thread class.
package com.example.threads;

public class createThread extends Thread {

    // LOOK INTO THIS!!
    // createThread() {
    // start();
    // }

    @Override
    public void run() {

        // prints eeven numbers
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i + " " + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        createThread thread1 = new createThread();

        // thread1.run(); //a new thread is not created and proceed with the main
        // thread stack
        // thread1.start(); // starts a separate thread

        createThread thread2 = new createThread();
        System.out.println(thread2.getName());
        System.out.println(thread2.getState());

        thread1.start();
        thread2.start();
        // thread2.start(); //Illegal Thread State Exception, cannot be restarted after
        // termination

        Thread thread3 = new Thread(new createThread(), "Thread 4");
        thread3.start();

        for (int i = 1; i <= 3; i++) {
            createThread thread4 = new createThread();
            thread4.start();
        }

    }
}
