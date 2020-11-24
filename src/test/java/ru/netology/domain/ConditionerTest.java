package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @ParameterizedTest
    @CsvSource(
            value = {"'minTemperature, maxTemperature, currentTemperature, expected', 0, 9, 4, 5",
                    "'minTemperature, maxTemperature, currentTemperature, expected', 0, 9, 9, 9"}
    )
    void shouldIncreaseCurrentTemperature(String test, int minTemperature, int maxTemperature, int currentTemperature, int expected) {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(minTemperature);
        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'minTemperature, maxTemperature, currentTemperature, expected', 0, 9, 6, 5",
                    "'minTemperature, maxTemperature, currentTemperature, expected', 0, 9, -5, 0"}
    )
    void shouldDecreaseCurrentTemperature(String test, int minTemperature, int maxTemperature, int currentTemperature, int expected) {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(minTemperature);
        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}