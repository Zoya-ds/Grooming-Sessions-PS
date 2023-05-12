package com.example.firstSetOfQuestions.quesFour;

public class quesFour {

    public static void main(String[] args) {

        User user1 = new User();
        user1.Name();

        UserTwo user2 = new UserTwo();
        user2.Name(); // method overriding

        // compile time polymorphism
        user2.Show(3);
        user2.Show("Lily");// method overloading

        // Runtime polymorphism
        User us1 = new User();
        us1.Name();

        User us2 = new UserTwo(); // upcasting
        us2.Name();
        System.out.println(us1.salary);
        System.out.println(us2.salary); // variables will not be upcasted?

    }

}
