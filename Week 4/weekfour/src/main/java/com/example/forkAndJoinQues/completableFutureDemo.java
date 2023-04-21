package com.example.forkAndJoinQues;

//Write a program to run a simple asynchronous stage using CompletableFuture.
//Run a task asynchronously and return the result ?

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class completableFutureDemo {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("Creating a new thread");
        });

        completableFuture.get();
        System.out.println("first processing done");

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(new Supplier<String>() {
            public String get() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                return "starting a separate thread";
            }
        });

        System.out.println(completableFuture2.get());
    }
}
