package com.example.threads.locks;

import java.util.concurrent.locks.ReentrantLock;

public class reentrantLockDemo implements Runnable {

    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " has acquired the lock");
            for (int i = 0; i < 3; i++)
                System.out.println(i + " " + Thread.currentThread().getName());

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getUser(Thread.currentThread().getName()); // locking across functios is not possible using synchronised

    }

    public void getUser(String name) {
        System.out.println("Hey! " + name);

        System.out.println(Thread.currentThread().getName() + " has released the block");
        lock.unlock();
    }

    public static void main(String[] args) {

        reentrantLockDemo r1 = new reentrantLockDemo();
        Thread thread1 = new Thread(r1, "first");
        Thread thread2 = new Thread(r1, "second");
        Thread thread3 = new Thread(r1, "third");

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
