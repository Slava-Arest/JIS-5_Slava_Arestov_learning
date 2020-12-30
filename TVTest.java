package Lecture_5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TVTest {

    TV tv;

    @Before
    public void setUp(){
        tv = new TV();
    }


    @Test
    public void testToString() {
    tv.setChannel(4);
    tv.setVolume(26);
    tv.setManufacturer("LG");
    tv.setItOn(true);
    String expected = "TV{" +
            "channel='4', " +
            "volume=26, " +
            "manufacturer='LG', " +
            "isItOn=true}";
    String actual = tv.toString();
    assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        TV expected = new TV();
        TV actual = new TV();
        assertEquals(expected, actual);
    }

    @Test
    public void testHashCode() {
        TV expected = new TV();
        TV actual = new TV();
        assertEquals(expected.hashCode(), actual.hashCode());

    }
}