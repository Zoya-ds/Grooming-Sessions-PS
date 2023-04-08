package com.example.threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class futureObjNCallable {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        FutureTask<Integer>[] returnedTask = new FutureTask[5];

        for (int i = 0; i < 5; i++) {
            // create an instance of Callable
            Callable<Integer> object1 = new demo();

            // create an instance of FutureTask with Callable
            returnedTask[i] = new FutureTask(object1);

            // create a Thread with FutureTask
            Thread thread = new Thread(returnedTask[i]);
            thread.start();
        }

        // use for loop for printing returned value of each callable
        for (int j = 0; j < 5; j++) {
            // use get() method of FutureTask to print the returned value
            System.out.println(returnedTask[j].get());
        }
    }
}

class demo implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return new Random().nextInt(100);
    }

}