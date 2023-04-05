package com.example.secondSetOfQuestions;

import java.lang.reflect.InvocationTargetException;

public class dynamicLoading {

    static {
        System.out.println("me is first");
    }

    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException,
            InvocationTargetException, NoSuchMethodException, SecurityException {

        Class cl = Class.forName("com.example.secondSetOfQuestions.test");

        System.out.println(cl.getName());
        Object obj = cl.getDeclaredConstructor().newInstance();

        test test1 = (test) obj;
        test1.display("Greetings!");

    }

}
