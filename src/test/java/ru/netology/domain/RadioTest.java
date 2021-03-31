package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RadioTest {

    @Test
    public void shouldSetValidStation( ) {
        Radio radio = new Radio( );
        radio.setMaxStation( 9 );
        radio.setMinStation( 0 );
        radio.setCurrentStation( 4 );
        assertEquals( 4, radio.getCurrentStation( ) );
    }

    @Test
    public void shouldMaxStation( ) {
        Radio radio = new Radio( );
        radio.setMaxStation( 9 );
        radio.setMinStation( 0 );
        radio.setCurrentStation(radio.getMaxStation( ));
        assertEquals( 9, radio.getCurrentStation( ) );
    }

    @Test
    public void shouldMixStation( ) {
        Radio radio = new Radio( );
        radio.setMaxStation( 9 );
        radio.setMinStation( 0 );
        radio.setCurrentStation(radio.getMinStation());
        assertEquals( 0, radio.getCurrentStation( ) );
    }

    @Test
    public void shouldSetNotValidStation( ) {
        Radio radio = new Radio( );
        radio.setMaxStation( 9 );
        radio.setMinStation( 0 );
        radio.setCurrentStation( 10 );
        assertEquals( 0, radio.getCurrentStation( ) );
    }

    @Test
    public void shouldSetSwitchStation( ) {
        Radio radio = new Radio( );
        radio.setMaxStation( 9 );
        radio.setMinStation( 0 );
        radio.setCurrentStation( 4 );
        radio.setPrevStation( );
        assertEquals( 3, radio.getCurrentStation( ) );
    }


    @Test
    public void shouldSetNextStation( ) {
        Radio radio = new Radio( );
        radio.setMaxStation( 9 );
        radio.setMinStation( 0 );
        radio.setCurrentStation( 4 );
        radio.setNextStation( );
        assertEquals( 5, radio.getCurrentStation( ) );
    }

    @Test
    public void shouldSetNotValidMinVolume( ) {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetNextVolume( ) {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(3);
        radio.increaseCurrentVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetPrevVolume( ) {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(3);
        radio.decreaseCurrentVolume();
        assertEquals(2, radio.getCurrentVolume());
    }


    @Test
    public void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setMinVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(9);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.setPrevStation();
        assertEquals(8, radio.getCurrentStation());
    }
    @Test
    public void nextMinStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(0);
        radio.setPrevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void nextMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation(9);
        radio.setMinStation(0);
        radio.setCurrentStation(9);
        radio.setNextStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    public void offRadio() {
        Radio radio = new Radio();
        radio.isOn();
        assertEquals(false, radio.isOn( ));
    }

    @Test
    public void onRadio() {
        Radio radio = new Radio();
        radio.setOn(true);
        assertEquals(true, radio.isOn( ));
    }
}
