//6.	Write program to implement produce and consumer model
package com.example.threads.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class messageService {
    public static void main(String[] args) {

        BlockingQueue<message> msqQueue = new ArrayBlockingQueue<>(10);
        producer producer = new producer(msqQueue);
        consumer consumer = new consumer(msqQueue);

        Thread producerThread = new Thread(producer);
        producerThread.start();

        Thread consumerThread = new Thread(consumer);
        consumerThread.start();
        System.out.println("Messaging has started...");
    }
}
