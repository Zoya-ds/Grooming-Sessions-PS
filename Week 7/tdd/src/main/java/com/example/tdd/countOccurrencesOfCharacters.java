package com.example.tdd;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

import lombok.Getter;

@Getter
public class countOccurrencesOfCharacters {

    private String givenString;

    public countOccurrencesOfCharacters(String givenString) {

        this.givenString = givenString;
    }

    public void countFrequencyOfCharacters() {

        Arrays.stream(givenString.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()))
                .forEach((a, b) -> System.out.println(a + ": " + b));

        // displayFrequencyOfCharactersInGivenString();

    }

    // public static void main(String[] args) {
    // countOccurrencesOfCharacters c = new
    // countOccurrencesOfCharacters("akaksjjal");
    // c.countFrequencyOfCharacters();
    // }
}
