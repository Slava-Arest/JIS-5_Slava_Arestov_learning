package Lecture_5;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    Counter counter = new Counter();

    @Test
    public void increment() {
        counter.setValue(30);
        counter.setStep(70);
        int expected = 100;
        int actual = counter.increment();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void decrement() {
        counter.setValue(90);
        counter.setStep(30);
        int expected = 60;
        int actual = counter.decrement();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        counter.setValue(0);
        int expected = 0;
        int actual = counter.clear();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setValue() {

    }

    @Test
    public void getValue() {
    }

    @Test
    public void setStep() {
    }

    @Test
    public void getStep() {
    }
}