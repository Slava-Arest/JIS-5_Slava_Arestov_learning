package Lecture_5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TvControllerTest {

    TvController tvController;
    TvService tvService;
   @Before
           public void setUp() {
       tvController = new TvController();
       tvService = new TvService();
   }

    @Test
    public void tvControllerIsOff() {
       assertFalse(tvService.tvIsOff());
    }
    @Test
    public void tvControllerIsOn(){
assertFalse(tvService.tvIsOn());
    }
    @Test
public void tvControllerChannelPlus(){
       tvController.channelPlus();
        int expected = 5;
        int actual = tvService.channelPlus();
        assertEquals(expected, actual);
    }
    @Test
    public void tvControllerChannelMinus(){
       tvController.channelMinus();
        int expected = 3;
        int actual = tvService.channelMinus();
        assertEquals(expected, actual);
    }
    @Test
    public void tvControllerVolumePlus(){
       tvController.volumePlus();
        int expected = 31;
        int actual = tvService.volumePlus();
        assertEquals(expected, actual);
    }
    @Test
    public void tvControllerVolumeMinus(){
       tvController.volumeMinus();
        int expected = 21;
        int actual = tvService.volumeMinus();
        assertEquals(expected, actual);
    }
}