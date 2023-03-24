package com.example;

public class quesFive {

    enum Days {

        SUNDAY,
        MONDAY,
        TUESDAY
    }

    public static void main(String[] args) {

        String newDay = "TUESDAY";

        Enum nameEnum = Enum.valueOf(Days.class, newDay);

        System.out.println(nameEnum);
    }
}
