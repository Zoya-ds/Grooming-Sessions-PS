package com.example.secondSetOfQuestions;

import java.lang.reflect.InvocationTargetException;

public class dynamicLoading {

    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class cl = Class.forName("com.example.secondSetOfQuestions.test");

        System.out.println(cl.getName());
        Object obj = cl.newInstance();

        test test1 = (test) obj;
        test1.display("Greetings!");

    }

}