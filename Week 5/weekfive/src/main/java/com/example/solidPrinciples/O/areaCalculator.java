package com.example.solidPrinciples.O;

public class areaCalculator {

    int area = 0;

    public int area(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            area = (int) (Math.PI * (Math.pow(c.getRadius(), 2)));
        }
        if (o instanceof Square) {
            Square s = (Square) o;
            area = (int) Math.pow(s.getEdge(), 2);
        }
        // invalidates the OCP
        if (o instanceof Square) {
            Cube c = (Cube) o;
            area = (int) (6 * Math.pow(c.getEdge(), 2));
        }

        return area;
    }

    // invalidates the SRP
    public int costOfFlooring(Object o) {

        int cost = 10 * area(o);
        return cost;

    }

}
