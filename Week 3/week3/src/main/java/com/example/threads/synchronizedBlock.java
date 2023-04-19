package com.example.threads;

public class synchronizedBlock implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " has started...");
        synchronized (synchronizedBlock.class) {
            System.out.println(Thread.currentThread().getName() + " has entered the synchronized block");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " ");
            }
        }
        System.out.println(Thread.currentThread().getName() + " has exited the synchronized block");

    }

    public static void main(String[] args) {

        synchronizedBlock block = new synchronizedBlock();
        Thread thread1 = new Thread(block);
        Thread thread2 = new Thread(block);

        thread1.start();
        thread2.start();

    }

}
