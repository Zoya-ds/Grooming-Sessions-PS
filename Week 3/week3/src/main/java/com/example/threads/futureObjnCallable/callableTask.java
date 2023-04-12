package com.example.threads.futureObjnCallable;

import java.util.concurrent.Callable;

public class callableTask implements Callable<String> {

    private String name;

    callableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws InterruptedException {
        // Thread.sleep(2000);
        return "Hey " + name;
    }

}
