package Lecture_6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    Car car;

    @Before
    public void setUp(){
        car = new Car();
    }


    @Test
    public void testToString() {
        car.setModel("Honda");
        car.setColor("Blue");
        car.setCurrentSpeed(120);
        car.setMaxSpeed(250);
        String expected = "Car{model='Honda', color='Blue', maxSpeed=250, currentSpeed=120}";
        String actual = car.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testEquals() {
        Car expected = new Car();
        Car actual = new Car();
        Assert.assertTrue(expected.equals(actual) && actual.equals(expected));
    }

    @Test
    public void testHashCode() {
        Car expected = new Car();
        Car actual = new Car();
        assertEquals(expected, actual);
    }
}