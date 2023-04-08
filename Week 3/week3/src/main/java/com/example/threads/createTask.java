package com.example.threads;

// public class createTask extends Thread {

//     @Override
//     public void run() {
//         System.out.println("Task one");
//     }

//     public static void main(String[] args) throws InterruptedException {

//         createTask thread1 = new createTask();
//         createTask thread2 = new createTask();

//         thread1.run();
//         Thread.sleep(3000);

//         thread2.run();
//     }
// }

public class createTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Task one");
    }

    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new createTask());
        Thread thread2 = new Thread(new createTask());

        thread1.run();
        Thread.sleep(3000);

        thread2.run();
    }
}
