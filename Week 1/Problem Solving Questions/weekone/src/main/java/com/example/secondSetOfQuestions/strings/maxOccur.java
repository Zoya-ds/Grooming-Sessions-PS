package com.example.secondSetOfQuestions.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class maxOccur {

    public static void main(String[] args) {

        String st = "";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");

        try {
            st = sc.nextLine().toLowerCase();
        } catch (Exception e) {
            System.out.println("Invalid input!");
        } finally {
            sc.close();

        }

        Map<Character, Integer> count = new HashMap<>();

        for (Character ch : st.toCharArray()) {
            if (count.keySet().contains(ch)) {
                count.put(ch, count.get(ch) + 1);
            } else {
                count.put(ch, 1);
            }
        }
        int max = 0;
        Character maxOccurence = null;
        for (Character ch : count.keySet()) {
            if (count.get(ch) > max) {
                max = count.get(ch);
                maxOccurence = ch;
            }
        }
        if (max == 0) {
            System.out.println("No character found!");
        } else {
            System.out.println("Maximum occuring character: " + maxOccurence);
            System.out.println("Number of occurences: " + max);
        }
    }

}
