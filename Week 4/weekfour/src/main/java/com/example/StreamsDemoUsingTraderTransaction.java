package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsDemoUsingTraderTransaction {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950));

        List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);

        /*
         * 
         * 1. Find all transactions in the year 2011 and sort them by value (small to
         * high).
         * 2. What are all the unique cities where the traders work?
         * 3. Find all traders from Cambridge and sort them by name.
         * 4. Return a string of all traders’ names sorted alphabetically.
         * 5. Are any traders based in Milan?
         * 6. Print all transactions’ values from the traders living in Cambridge.
         * 7. What’s the highest value of all the transactions?
         * 8. Find the transaction with the smallest value
         * 
         */

        // 1. Find all transactions in the year 2011 and sort them by value (small to
        // high).
        transactions.stream().forEach(null);
        transactions.stream().filter(i -> i.getYear() == 2011).sorted((a, b) -> a.getValue() - b.getValue())
                .forEach(n -> System.out.println(n));

        System.out.println("--------------");
        // 2. What are all the unique cities where the traders work?
        transactions.stream().map(i -> i.getTrader().getCity()).distinct().forEach(i -> System.out.println(i));
        System.out.println("--------------");

        // 3. Find all traders from Cambridge and sort them by name.
        transactions.stream()
                .filter(i -> i.getTrader().getCity() == "Cambridge")
                .sorted((a, b) -> a.getTrader().getName().compareToIgnoreCase(b.getTrader().getName()))
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println("--------------");

        // 4. Return a string of all traders’ names sorted alphabetically.
        transactions.stream()
                .map(n -> n.getTrader().getName())
                .sorted(Comparator.naturalOrder())
                .distinct()
                .forEach(i -> System.out.println(i));

        System.out.println("--------------");

        // 5. Are any traders based in Milan?
        boolean result = transactions.stream()
                .anyMatch(i -> i.getTrader().getCity() == "Milan");
        System.out.println("Any trader in milan: " + result);

        System.out.println("--------------");

        // 6. Print all transactions’ values from the traders living in Cambridge.
        transactions.stream()
                .filter(n -> n.getTrader().getCity() == "Cambridge")
                .forEach(i -> System.out.println(i.getValue()));

        System.out.println("--------------");

        // 7. What’s the highest value of all the transactions?
        Optional<Transaction> maxValue = transactions.stream().max((a, b) -> a.getValue() - b.getValue());

        System.out.println("Highest value: " + maxValue.get().getValue());
        System.out.println("--------------");

        // 8. Find the transaction with the smallest value
        Optional<Transaction> minValue = transactions.stream().min((a, b) -> a.getValue() - b.getValue());
        System.out.println("Lowest value: " + minValue.get());
        System.out.println("--------------");
    }
}

class Transaction {
    private final Trader trader;
    private final int year;
    private final int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getYear() {
        return this.year;
    }

    public int getValue() {
        return this.value;
    }

    public String toString() {
        return "{" + this.trader + ", " +
                "year: " + this.year + ", " +
                "value:" + this.value + "}";
    }
}

class Trader {
    private final String name;
    private final String city;

    public Trader(String n, String c) {
        this.name = n;
        this.city = c;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}