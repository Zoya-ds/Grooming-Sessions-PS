package com.example.behavioral.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    @Override
    public int visit(Book book) {
        int cost = 0;
        int price = book.getPrice();
        if (price > 500) {
            cost = (int) (price - (price * 0.1));
        } else
            cost = price;

        System.out.println("Cost of " + book.getBookName() + " book = Rs. " + cost);
        return cost;
    }

    @Override
    public int visit(Fruits fruits) {
        int cost = fruits.getPricePerKg() * fruits.getWeight();

        System.out.println("Cost of " + fruits.getPricePerKg() + "kg of " + fruits.getFruitName() + " = Rs. " + cost);
        return cost;
    }

}
