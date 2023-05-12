package com.example.secondSetOfQuestions.staticc;

public class staticMethod {

    static int count = 0;

    int incrementTwice = 0;

    public void counter() {
        count++;
    }

    public static void display() {
        System.out.println("1st counter: " + count);
        // System.out.println("2nd counter: " + incrementTwice); // non-static variable
        // cannot be accessed by a static
        // method
    }

    public static void main(String[] args) {

        staticMethod.display();
        // staticImpl.counter(); // not a static function, hence, needs an object to be
        // accessed

        staticMethod s1Impl = new staticMethod();

        s1Impl.counter();
        s1Impl.counter();
        s1Impl.display(); // static methods can be called using an instance

    }

}
