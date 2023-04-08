package com.example.threads;

public class interruptThread {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("thread has started");
                    Thread.sleep(3000);
                    System.out.println("thread is running");
                } catch (InterruptedException e) {
                    throw new RuntimeException("Thread interrupted..." + e);
                }
            }
        });

        thread1.start();
        try {
            thread1.interrupt();
        } catch (Exception e) {
            System.out.println("Exception caught " + e.getMessage());
        }
    }
}
