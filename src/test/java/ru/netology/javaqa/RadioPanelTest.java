package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioPanelTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/enterRadioChannel.csv")
    void testEnterRadioChannel(int newRadioChannel, int expected) {
        Radio radio = new Radio();

        radio.setRadioChannel(newRadioChannel);

        //int expected = 1;
        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextRadioChannel.csv")
    void testNextRadioChannel(int newRadioChannel, int expected) {
        Radio radio = new Radio();

        radio.setRadioChannel(newRadioChannel);

        radio.nextRadioChannel();

        //int expected = 3;
        int actual = radio.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevRadioChannel.csv")
    void testPrevRadioChannel(int newRadioChannel, int expected) {
        Radio radio = new Radio();

        radio.setRadioChannel(newRadioChannel);

        radio.prevRadioChannel();

        //int expected = 9;
        int actual = radio.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/currentVolume.csv")
    void testCurrentVolume(int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(currentVolume);

        //int expected = 0;
        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    void testIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(currentVolume);

        radio.increaseVolume();

        //int expected = 6;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/downVolume.csv")
    void testDownVolume(int currentVolume, int expected) {
        Radio radio = new Radio();

        radio.setVolume(currentVolume);

        radio.downVolume();

        //int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}