package com.example;

public class User {

    public String firstName = "Zoya";
    protected String email = "zoya@gmail.com";
    private String password = "zoya321";

    public String getPassword() {
        return password;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

}
