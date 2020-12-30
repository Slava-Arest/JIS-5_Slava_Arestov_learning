package Lecture_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhraseAnalyserTest {
PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
    @Test
    public void analyseString1(){
        String expected = "It stands no chance";
        String actual = phraseAnalyser.analyse("Make something Great Again");
        assertEquals(expected, actual);
    }
    @Test
    public void analyseString2(){
        String expected = "It could be worse";
        String actual = phraseAnalyser.analyse("Great Again");
        assertEquals(expected, actual);
    }
    @Test
    public void analyseString3(){
        String expected = "It is fine, really";
        String actual = phraseAnalyser.analyse("Something else");
        assertEquals(expected, actual);
    }
}