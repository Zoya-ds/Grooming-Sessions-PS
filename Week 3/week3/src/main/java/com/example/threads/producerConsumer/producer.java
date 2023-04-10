package com.example.threads.producerConsumer;

import java.util.concurrent.BlockingQueue;

public class producer implements Runnable {

    private BlockingQueue<message> msgQueue;

    producer(BlockingQueue<message> msg) {
        this.msgQueue = msg;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            message msg = new message(i + " Hey");
            try {
                Thread.sleep(1000);
                msgQueue.put(msg);
                System.out.println("Produced " + msg.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // adding exit message
        message msg = new message("exit");
        try {
            msgQueue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
