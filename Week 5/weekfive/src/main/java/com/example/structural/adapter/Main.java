package com.example.structural.adapter;

public class Main {

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        toyDuck toyDuck = new plasticToyDuck();

        sparrow.fly();
        sparrow.speak();

        toyDuck.squeak();

        toyDuck plasticSparrow = new birdAdapter(sparrow);
        plasticSparrow.squeak();
    }
}
