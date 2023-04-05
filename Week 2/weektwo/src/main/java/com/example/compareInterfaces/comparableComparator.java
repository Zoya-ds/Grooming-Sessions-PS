//comparable vs comparator
package com.example.compareInterfaces;

import java.util.ArrayList;
import java.util.Collections;

public class comparableComparator {

    public static void main(String[] args) {

        ArrayList<User> userList = new ArrayList<>();

        userList.add(new User(21, "abc", "afd@gm.com"));
        userList.add(new User(45, "bop", "dlj@gm.com"));
        userList.add(new User(14, "cpa", "ctr@gm.com"));
        userList.add(new User(99, "dyz", "bpo@gm.com"));

        // ascending order using comparable
        Collections.sort(userList);

        for (User user : userList) {
            user.displayAllValues();
        }

        // descending order using comparator
        Collections.sort(userList, new userIdComparator());
        for (User user : userList) {
            user.displayAllValues();
        }

        // userList.sort(new userIdComparator()); // sort function provided by List
        // interface
        // userList.sort(); //gives error, doe snot use comparable
    }
}
