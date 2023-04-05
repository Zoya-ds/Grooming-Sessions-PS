//implement comparator using lambda expression

package com.example.compareInterfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class comparatorWithLambda {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();

        userList.add(new User(21, "abc", "afd@gm.com"));
        userList.add(new User(45, "bop", "dlj@gm.com"));
        userList.add(new User(14, "cpa", "ctr@gm.com"));
        userList.add(new User(99, "dyz", "bpo@gm.com"));

        // without lambda
        System.out.println("In ascending order:");
        userList.sort(new Comparator<User>() {
            public int compare(User u1, User u2) {
                return u1.userId - u2.userId; // in ascending order
            }
        });

        // userList.sort(new userIdComparator());

        for (User u : userList) {
            u.displayAllValues();
        }

        // with lambda
        System.out.println("In descending order:");
        userList.sort((User u1, User u2) -> u2.userId - u1.userId); // in descending order

        userList.forEach((user) -> user.displayAllValues());
    }
}
