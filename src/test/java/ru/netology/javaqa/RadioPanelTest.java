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
    void testEnterRadioChannel(int quantityRadioStation, int newRadioChannel, int expected) {

        //устанавливаем количество радиостанций:
        Radio radio = new Radio(quantityRadioStation);

        //устанавливаем номер радиостанции:
        radio.setRadioChannel(newRadioChannel);

        int actual = radio.getRadioChannel();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/nextRadioChannel.csv")
    void testNextRadioChannel(int quantityRadioStation, int newRadioChannel, int expected) {

        //устанавливаем количество радиостанций:
        Radio radio = new Radio(quantityRadioStation);

        //устанавливаем номер радиостанции:
        radio.setRadioChannel(newRadioChannel);

        //Переключаем на стледующую радиостанцию:
        radio.nextRadioChannel();

        int actual = radio.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/prevRadioChannel.csv")
    void testPrevRadioChannel(int quantityRadioStation, int newRadioChannel, int expected) {

        //устанавливаем количество радиостанций:
        Radio radio = new Radio(quantityRadioStation);

        //устанавливаем номер радиостанции:
        radio.setRadioChannel(newRadioChannel);

        //Переключаем на предыдущую радиостанцию:
        radio.prevRadioChannel();

        int actual = radio.getRadioChannel();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/currentVolume.csv")
    void testCurrentVolume(int currentVolume, int expected) {
        Radio radio = new Radio();

        //Устанавливаем уровень звука:
        radio.setVolume(currentVolume);

        int actual = radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    void testIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();

        //Устанавливаем уровень звука:
        radio.setVolume(currentVolume);

        //Увеличиваем громкость:
        radio.increaseVolume();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/downVolume.csv")
    void testDownVolume(int currentVolume, int expected) {
        Radio radio = new Radio();

        //Устанавливаем уровень звука:
        radio.setVolume(currentVolume);

        //Уменьшаем громкость:
        radio.downVolume();

        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
}