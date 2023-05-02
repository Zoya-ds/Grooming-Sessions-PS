package com.example.structural.adapter;

public class birdAdapter implements toyDuck {

    Bird bird;

    public birdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.speak();
    }

}
