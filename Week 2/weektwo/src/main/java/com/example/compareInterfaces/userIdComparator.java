package com.example.compareInterfaces;

import java.util.Comparator;

public class userIdComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        User u1 = (User) o1;
        User u2 = (User) o2;

        return u2.userId - u1.userId;
    }
}