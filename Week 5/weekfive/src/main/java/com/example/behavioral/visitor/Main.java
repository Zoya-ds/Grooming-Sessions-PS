package com.example.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Item> itemList = new ArrayList<Item>();

        itemList.add(new Fruits("Apple", 10, 15));
        itemList.add(new Book("Maths", 1000));
        itemList.add(new Book("English", 400));

        int totalAmount = calculatePrice(itemList);
        System.out.println("Total amount to be paid: Rs. " + totalAmount);
    }

    private static int calculatePrice(List<Item> itemList) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();

        int cost = 0;
        for (Item item : itemList) {
            cost += item.addToCart(visitor);
        }
        return cost;
    }

}
