package com.example;

public class quesFive {

    enum Days {

        SUNDAY,
        MONDAY
    }

    public static void main(String[] args) {

        String newDay = "TUESDAY";

        // Days nn = Days.MONDAY;

        Enum nameEnum = Enum.valueOf(Days.class, newDay);

        System.out.println(nameEnum);
    }
}
