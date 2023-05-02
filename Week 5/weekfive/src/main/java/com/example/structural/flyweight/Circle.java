package com.example.structural.flyweight;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle implements Shape {

    private String color;
    private int radius;

    Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Radius- " + radius + " cm, Color- " + color);
    }

}
