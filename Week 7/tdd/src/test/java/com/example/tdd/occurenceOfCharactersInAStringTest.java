package com.example.tdd;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.hibernate.action.spi.Executable;
import org.junit.jupiter.api.Test;

import ch.qos.logback.core.status.Status;

public class occurenceOfCharactersInAStringTest {

    @Test
    public void checkForEmptyString() {
        countOccurrencesOfCharacters s = new countOccurrencesOfCharacters("");
        assertEquals("", s.getGivenString());
    }

    @Test
    public void checkForValidStringInput() {

        countOccurrencesOfCharacters s = new countOccurrencesOfCharacters("abc");
        assertNotNull(s, "valid string");
        assertTrue(s.getGivenString().length() > 0);
    }

    @Test
    public void getFrequencyOfCharacters() {

        countOccurrencesOfCharacters s = new countOccurrencesOfCharacters("ala");

        assertDoesNotThrow(() -> s.countFrequencyOfCharacters());
    }

}
