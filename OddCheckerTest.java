package Lecture_6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddCheckerTest {

    OddChecker oddChecker;

    @Before
    public void setUp(){
        oddChecker = new OddChecker();
    }

    @Test
    public void forOddChecker() {
        int expected = 51;
        int actual = oddChecker.ForOddChecker();
        assertEquals(expected, actual);
    }

    @Test
    public void doWhileOddChecker() {
        int expected = 51;
        int actual = oddChecker.DoWhileOddChecker();
        assertEquals(expected, actual);
    }

    @Test
    public void whileOddChecker() {
        int expected = 51;
        int actual = oddChecker.WhileOddChecker();
        assertEquals(expected, actual);
    }
}