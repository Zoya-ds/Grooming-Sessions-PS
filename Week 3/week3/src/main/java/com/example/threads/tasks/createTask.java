//2.	How will you create a task & execute it.
package com.example.threads.tasks;

public class createTask implements Runnable {

    static int count = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                count++;

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new createTask());
        thread1.start();

        Thread thread2 = new Thread(new createTask());
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count);
    }
}

// public class createTask extends Thread {

// @Override
// public void run() {
// System.out.println("Task one");
// }

// public static void main(String[] args) throws InterruptedException {

// createTask thread1 = new createTask();
// createTask thread2 = new createTask();

// thread1.start();
// Thread.sleep(3000);

// thread2.start();
// }
// }