//use equals without overriding it for user defined objects
package com.example.compareInterfaces;

public class equalsOverride {

    public static void main(String[] args) {

        User user1 = new User(21, "abc", "abc@gm.com");
        User user2 = new User(21, "abc", "abc@gm.com");

        System.out.println(user1.equals(user2));

    }
}
