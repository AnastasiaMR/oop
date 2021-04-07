package ru.netology.constructor;

import org.junit.jupiter.api.Test;
import ru.netology.constructor.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RadioTest {

    @Test
    public void shouldSetValidStation( ) {
        Radio radio = new Radio( 10, 0 , 3, 100, 0, 0);
        assertEquals( 3, radio.getCurrentStation( ) );
    }

    @Test
    public void shouldQuantityStation() {
        Radio radio = new Radio(10);
        assertEquals( 10, radio.getQuantityStation( ) );
    }

    @Test
    public void shouldSetMaxNotValidStation( ) {
        Radio radio = new Radio( 10, 0 , 10, 100, 0, 0);
        radio.setCurrentStation( 11 );
        assertEquals( 0, radio.getCurrentStation( ) );
    }

    @Test
    public void shouldSetMinNotValidStation( ) {
        Radio radio = new Radio(10, 0, 0, 100, 0, 0);
        radio.setCurrentStation( -1 );
        assertEquals( 10, radio.getCurrentStation( ) );
    }

    @Test
    public void shouldSetNextStation( ) {
        Radio radio = new Radio(10, 0, 1, 100, 0, 0);
        radio.NextStation( );
        assertEquals( 2, radio.getCurrentStation( ) );
    }

    @Test
    public void shouldSetPrevStation( ) {
        Radio radio = new Radio(10, 0, 2, 100, 0, 0);
        radio.PrevStation( );
        assertEquals( 1, radio.getCurrentStation( ) );
    }

    @Test
    public void shouldSetValidVolume( ) {
        Radio radio = new Radio( 10, 0 , 3, 100, 0, 5);
        assertEquals( 5, radio.getCurrentVolume( ) );
    }

    @Test
    public void shouldSetNotValidMinVolume( ) {
        Radio radio = new Radio(10, 0, 1, 100, 0, 0);
        radio.setCurrentVolume( -1 );
        assertEquals(0, radio.getCurrentVolume( ) );
    }


    @Test
    public void shouldSetNotValidMaxVolume() {
        Radio radio = new Radio(10, 0, 1, 100, 0, 100);
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetIncreaseCurrentVolume( ) {
        Radio radio = new Radio( 10, 0 , 3, 100, 0, 9);
        radio.increaseCurrentVolume( );
        assertEquals( 10, radio.getCurrentVolume( ) );
    }

    @Test
    public void shouldSetDecreaseCurrentVolume( ) {
        Radio radio = new Radio( 10, 0 , 3, 100, 0, 9);
        radio.decreaseCurrentVolume( );
        assertEquals( 8, radio.getCurrentVolume( ) );
    }

}
