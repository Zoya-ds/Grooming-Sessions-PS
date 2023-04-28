package com.example.solidPrinciples.D;

public class areaCalculator implements IareaCalculator {

    int area = 0;

    @Override
    public int area(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            area = (int) (Math.PI * (Math.pow(c.getRadius(), 2)));
        }
        if (o instanceof Square) {
            Square s = (Square) o;
            area = (int) Math.pow(s.getEdge(), 2);
        }

        return area;
    }
}
