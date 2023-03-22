package com.example.quesThree;

public class quesThree {

    public static void main(String[] args) {
        userTwo user1 = new userTwo();

        user1.name();
        user1.email();
        // user1.number(); //error, not accessible

        userFour user2 = new userFour();

        user2.name();
        user2.email();
        user2.number();
        user2.organization();

    }

}
