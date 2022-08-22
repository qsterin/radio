package ru.netology.javaqa;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void lastStation() {
        Radio radio = new Radio();
        radio.next();
        radio.setCurrentStation(9);
        int expected = 0;
        int actual = radio.getCurrentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void middleStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        radio.prev();
        int expected = 5;
        int actual = radio.getCurrentStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void edgeVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void edgeStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation;
        Assertions.assertEquals(expected, actual);
    }
}
