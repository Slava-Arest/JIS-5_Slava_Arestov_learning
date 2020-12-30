package Lecture_5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TvServiceTest {

    TvService tvService;

    @Before
    public void setUp(){
        tvService = new TvService();
    }

    @Test
    public void channelPlus() {
        int expected = 5;
        int actual = tvService.channelPlus();
        assertEquals(expected, actual);
    }

    @Test
    public void channelMinus() {
        int expected = 3;
        int actual = tvService.channelMinus();
        assertEquals(expected, actual);
    }

    @Test
    public void volumePlus() {
        int expected = 31;
        int actual = tvService.volumePlus();
        assertEquals(expected, actual);
    }

    @Test
    public void volumeMinus() {
        int expected = 21;
        int actual = tvService.volumeMinus();
        assertEquals(expected, actual);
    }

    @Test
    public void tvIsOn() {
        boolean expected = false;
        boolean actual = tvService.tvIsOn();
        assertEquals(expected, actual);
    }

    @Test
    public void tvIsOff() {
        boolean expected = false;
        boolean actual = tvService.tvIsOff();
        assertEquals(expected, actual);
    }
}