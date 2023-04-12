//How will you create a task & execute it - Multiple tasks 
package com.example.threads.tasks;

public class createMultiTasks {

    public static void main(String[] args) {

        Thread threadOne = new Thread(new TaskOne());
        Thread threadTwo = new Thread(new TaskTwo());

        threadOne.start();
        threadTwo.start();
    }
}
