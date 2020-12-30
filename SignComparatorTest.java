package Lecture_4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SignComparatorTest {

    SignComparator signComparator = new SignComparator();

    @Test
    public void compareIsPositive() {
        String expected = "Number is positive";
        String actual = signComparator.compare(5);
        assertEquals(expected, actual);
    }
@Test
    public void compareIsNegative() {
        String expected = "Number is negative";
        String actual = signComparator.compare(-5);
        assertEquals(expected, actual);
}
@Test
    public void compareIsZero(){
        String expected = "Number is equals zero";
        String actual = signComparator.compare(0);
        assertEquals(expected, actual);
}
    }
