package Lecture_6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumbersTest {

    PrimeNumbers primeNumbers;

    @Before
    public void setUp(){
        primeNumbers = new PrimeNumbers();
    }

    @Test
    public void main() {
        primeNumbers.main();
    }
}