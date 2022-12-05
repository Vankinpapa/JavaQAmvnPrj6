package ru.netology.javaqa;

public class Radio {

    private int radioChannel;
    private int volume;

    public void setRadioChannel(int newRadioChannel) {

        if (newRadioChannel < 0) {
            return;
        }
        if (newRadioChannel > 9) {
            return;
        }
        radioChannel = newRadioChannel;
    }

    public int getRadioChannel() {
        return radioChannel;
    }

    public void nextRadioChannel() {
        if (radioChannel < 9) {
            radioChannel = radioChannel + 1;
        } else {
            radioChannel = 0;
        }
    }

    public void prevRadioChannel() {
        if (radioChannel > 0) {
            radioChannel = radioChannel - 1;
        } else {
            radioChannel = 9;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        volume = currentVolume;
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        } else {
            volume = 10;
        }
    }

    public void downVolume() {
        if (volume > 0) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
    }
}

