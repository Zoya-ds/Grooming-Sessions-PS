package com.example.structural.bridge;

public class Main {

    public static void main(String[] args) {
        
        Circle circle = new Circle(7);
        Square square = new Square(5);

        System.out.println(circle.area());
        System.out.println(square.area());

    }
}
