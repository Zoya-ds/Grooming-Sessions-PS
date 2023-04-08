package com.example.threads;

public class createMultiTasks {

    public static void main(String[] args) {

        TaskOne threadOne = new TaskOne();
        TaskTwo threadTwo = new TaskTwo();

        threadOne.run();
        threadTwo.run();
    }
}

class TaskOne extends Thread {

    @Override
    public void run() {
        System.out.println("Task one");
    }
}

class TaskTwo extends Thread {

    @Override
    public void run() {
        System.out.println("Task two");
    }
}