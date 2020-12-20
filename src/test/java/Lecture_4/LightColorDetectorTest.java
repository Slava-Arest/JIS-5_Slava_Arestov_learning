package Lecture_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class LightColorDetectorTest {

    LightColorDetector lightColorDetector = new LightColorDetector();

    @Test
    public void colorISViolet(){
        String expected = "Violet";
        String actual = lightColorDetector.colorDetect(440);
        assertEquals(expected, actual);
    }
    @Test
    public void colorIsBlue(){
        String expected = "Blue";
        String actual = lightColorDetector.colorDetect(457);
        assertEquals(expected, actual);
    }
    @Test
    public void colorIsGreen(){
        String expected = "Green";
        String actual = lightColorDetector.colorDetect(506);
        assertEquals(expected, actual);
    }
    @Test
    public void colorIsYellow(){
        String expected = "Yellow";
        String actual = lightColorDetector.colorDetect(581);
        assertEquals(expected, actual);
    }
    @Test
    public void colorIsOrange(){
        String expected = "Orange";
        String actual = lightColorDetector.colorDetect(607);
        assertEquals(expected, actual);
    }
    @Test
    public void colorIsRed(){
        String expected = "Red";
        String actual = lightColorDetector.colorDetect(670);
        assertEquals(expected, actual);
    }
    @Test
    public void colorIsInvisible(){
        String expected = "Invisible light";
        String actual = lightColorDetector.colorDetect(807);
        assertEquals(expected, actual);
    }
    @Test
    public void colorIsInvisible2() {
        String expected = "Invisible light";
        String actual = lightColorDetector.colorDetect(304);
        assertEquals(expected, actual);
    }
}