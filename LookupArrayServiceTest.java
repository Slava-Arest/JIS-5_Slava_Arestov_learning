package Lecture_7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LookupArrayServiceTest {

    LookupArrayService lookupArrayService;

    @Before
    public void setUp(){
        lookupArrayService = new LookupArrayService();
    }

    @Test
    public void findMax() {
        int[] numberOfMax = {10, 23, 84, 16, 36, 25, 30, 38};
        int expected = 84;
        int actual = lookupArrayService.findMax(numberOfMax);
        assertEquals(expected, actual);
    }

    @Test
    public void findMin() {
        int[] numberOfMin = {10, 23, 84, 16, 36, 25, 30, 38};
        int expected = 10;
        int actual = lookupArrayService.findMin(numberOfMin);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfMax() {
        int[] indexOfMax = {10, 23, 84, 16, 36, 25, 30, 38};
        int expected = 2;
        int actual = lookupArrayService.indexOfMax(indexOfMax);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfMin() {
        int[] indexOfMin = {10, 23, 84, 16, 36, 25, 30, 38};
        int expected = 0;
        int actual = lookupArrayService.indexOfMin(indexOfMin);
        assertEquals(expected, actual);
    }

    @Test
    public void indexOfNumber() {
        int[] justNumber = {10, 23, 84, 16, 36, 25, 30, 38};
        int expected = 5;
        int actual = lookupArrayService.indexOfNumber(justNumber, 25);
        assertEquals(expected, actual);
    }
}