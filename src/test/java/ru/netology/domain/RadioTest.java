package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {"'minNumberCurrentRadio, maxNumberCurrentRadio, numberCurrentRadio, expected', 0, 9, 6, 7",
                    "'minNumberCurrentRadio, maxNumberCurrentRadio, numberCurrentRadio, expected', 0, 9, 9, 0"}
    )
    void shouldNextNumberCurrentRadio(String test, int minNumberCurrentRadio, int maxNumberCurrentRadio, int numberCurrentRadio, int expected){
        Radio radio = new Radio();
        radio.setMinNumberCurrentRadio(minNumberCurrentRadio);
        radio.setMaxNumberCurrentRadio(maxNumberCurrentRadio);
        radio.setNumberCurrentRadio(numberCurrentRadio);
        radio.nextNumberCurrentRadio();
        assertEquals(expected,radio.getNumberCurrentRadio());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'minNumberCurrentRadio, maxNumberCurrentRadio, numberCurrentRadio, expected', 0, 9, 6, 5",
                    "'minNumberCurrentRadio, maxNumberCurrentRadio, numberCurrentRadio, expected', 0, 9, 0, 9"}
    )
    void shouldPrevNumberCurrentRadio(String test, int minNumberCurrentRadio, int maxNumberCurrentRadio, int numberCurrentRadio, int expected){
        Radio radio = new Radio();
        radio.setMinNumberCurrentRadio(minNumberCurrentRadio);
        radio.setMaxNumberCurrentRadio(maxNumberCurrentRadio);
        radio.setNumberCurrentRadio(numberCurrentRadio);
        radio.prevNumberCurrentRadio();
        assertEquals(expected,radio.getNumberCurrentRadio());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'minSoundVolume, maxSoundVolume, soundVolume, expected', 0, 10, 6, 7",
                    "'minSoundVolume, maxSoundVolume, soundVolume, expected', 0, 10, 10, 10"}
    )
    void shouldIncreaseSoundVolume(String test, int minSoundVolume, int maxSoundVolume, int soundVolume, int expected){
        Radio radio = new Radio();
        radio.setMinSoundVolume(minSoundVolume);
        radio.setMaxSoundVolume(maxSoundVolume);
        radio.setSoundVolume(soundVolume);
        radio.increaseSoundVolume();
        assertEquals(expected,radio.getSoundVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'minSoundVolume, maxSoundVolume, soundVolume, expected', 0, 10, 6, 5",
                    "'minSoundVolume, maxSoundVolume, soundVolume, expected', 0, 10, 0, 0"}
    )
    void shouldDecreaseSoundVolume(String test, int minSoundVolume, int maxSoundVolume, int soundVolume, int expected){
        Radio radio = new Radio();
        radio.setMinSoundVolume(minSoundVolume);
        radio.setMaxSoundVolume(maxSoundVolume);
        radio.setSoundVolume(soundVolume);
        radio.decreaseSoundVolume();
        assertEquals(expected,radio.getSoundVolume());
    }
}
