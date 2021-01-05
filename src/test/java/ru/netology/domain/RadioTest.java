package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void shouldNextNumberCurrentRadio() {
        Radio radio = new Radio(27, 0, 27, 12, 0, 100);
        radio.nextNumberCurrentRadio();
        assertEquals(0, radio.getNumberCurrentRadio());
    }

    @Test
    void shouldPrevNumberCurrentRadio() {
        Radio radio = new Radio(0, 0, 27, 12, 0, 100);
        radio.prevNumberCurrentRadio();
        assertEquals(27, radio.getNumberCurrentRadio());
    }

    @Test
    void shouldIncreaseSoundVolume() {
        Radio radio = new Radio(5, 0, 27, 100, 0, 100);
        radio.increaseSoundVolume();
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    void shouldDecreaseSoundVolume() {
        Radio radio = new Radio(5, 0, 27, 0, 0, 100);
        radio.decreaseSoundVolume();
        assertEquals(0, radio.getSoundVolume());
    }
}
