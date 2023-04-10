package com.example.threads.producerConsumer;

import java.util.concurrent.BlockingQueue;

public class consumer implements Runnable {

    private BlockingQueue<message> msgQueue;

    consumer(BlockingQueue<message> q) {
        this.msgQueue = q;
    }

    @Override
    public void run() {
        try {
            message msg;

            while ((msg = msgQueue.take()).getMessage() != "exit") {
                Thread.sleep(100);
                System.out.println("Consumed " + msg.getMessage());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
