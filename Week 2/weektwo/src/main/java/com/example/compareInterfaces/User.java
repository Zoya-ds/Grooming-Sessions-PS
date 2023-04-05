package com.example.compareInterfaces;

public class User implements Comparable {

    int userId;
    String name;
    String email;

    User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    public void displayAllValues() {
        System.out.println(userId + " " + name + " " + email);
    }

    @Override
    public int compareTo(Object o) {
        User u = (User) o;
        return userId - u.userId;
    }

    @Override
    public boolean equals(Object o) {
        User obj = (User) o;
        if (this.userId == obj.userId && this.name == obj.name && this.email == obj.email)
            return true;

        return false;
    }

}
