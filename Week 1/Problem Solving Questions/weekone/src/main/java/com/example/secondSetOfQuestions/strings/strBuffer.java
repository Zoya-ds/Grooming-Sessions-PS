package com.example.secondSetOfQuestions.strings;

//synchronized
public class strBuffer {

    public static void main(String[] args) {

        // StringBuffer str1 = new StringBuffer();

        // StringBuffer str2= new StringBuffer(10);

        StringBuffer str3 = new StringBuffer("abcdef");
        str3.append("znma");
        display(str3);
        display(str3.reverse());
        display(str3.insert(2, "pqr"));

        System.out.println(str3.toString());

    }

    static void display(StringBuffer s) {
        System.out.println("String:" + s);
        System.out.println("Length: " + s.length());
        System.out.println("Capacity: " + s.capacity());
        System.out.println("------------------");

    }

}
