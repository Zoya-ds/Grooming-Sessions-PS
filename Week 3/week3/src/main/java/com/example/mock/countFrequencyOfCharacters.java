package com.example.mock;

import java.util.HashMap;
import java.util.Map;

public class countFrequencyOfCharacters {

    String givenString;
    Map<Character, Integer> frequencyOfCharacters;

    public countFrequencyOfCharacters(String givenString) {

        this.givenString = givenString;
        frequencyOfCharacters = new HashMap<>();
    }

    public void countFrequencyOfCharactersInGivenString() {

        for (Character ch : givenString.toCharArray()) {
            if (frequencyOfCharacters.keySet().contains(ch)) {
                frequencyOfCharacters.put(ch, frequencyOfCharacters.get(ch) + 1);
            } else {
                frequencyOfCharacters.put(ch, 1);
            }
        }
        displayFrequencyOfCharactersInGivenString();

    }

    private void displayFrequencyOfCharactersInGivenString() {
        for (Character c : frequencyOfCharacters.keySet()) {
            System.out.println(c + ": " + frequencyOfCharacters.get(c));
        }
    }
}
