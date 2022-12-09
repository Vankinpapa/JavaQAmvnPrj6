package ru.netology.javaqa;

public class Radio {

    private int firstRadioChannel = 0;
    private int lastRadioChannel = 9;
    private int currentRadioChannel = firstRadioChannel;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio (int quantityRadioStation){

        this.lastRadioChannel = firstRadioChannel + quantityRadioStation - 1;

    }

    public Radio(){}
    public void setRadioChannel(int newRadioChannel) {

        if (newRadioChannel < firstRadioChannel) {
            return;
        }
        if (newRadioChannel > lastRadioChannel) {
            return;
        }
        currentRadioChannel = newRadioChannel;
    }

    public int getRadioChannel() {
        return currentRadioChannel;
    }

    public void nextRadioChannel() {
        if (currentRadioChannel < lastRadioChannel) {
            currentRadioChannel = currentRadioChannel + 1;
        } else {
            currentRadioChannel = firstRadioChannel;
        }
    }

    public void prevRadioChannel() {
        if (currentRadioChannel > firstRadioChannel) {
            currentRadioChannel = currentRadioChannel - 1;
        } else {
            currentRadioChannel = lastRadioChannel;
        }
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void downVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }
}

