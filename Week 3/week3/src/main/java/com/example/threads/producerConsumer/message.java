package com.example.threads.producerConsumer;

public class message {

    private String msg;

    public message(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return this.msg;
    }

    public void setMessage(String str) {
        this.msg = str;
    }
}
