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
    public void shouldSetNotValidMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(10);
        radio.setMinVolume(0);
        radio.setCurrentVolume(10);
        radio.increaseCurrentVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
}
