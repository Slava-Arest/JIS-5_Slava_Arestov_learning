package Lecture_6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarServiceTest {

    CarService carService;
    Car honda;

    @Before
    public void setUp(){
        carService = new CarService(honda);
        honda = new Car();
    }

    @Test
    public void accelerateTargetSpeedRaise() {
        honda.setCurrentSpeed(70);
        int expected = 100;
        int actual = carService.accelerate(100, honda);
        assertEquals(expected, actual);
    }

    @Test
    public void accelerateCurrentSpeedRaise(){
        honda.setCurrentSpeed(80);
        int expected = 80;
        int actual = carService.accelerate(80, honda);
        assertEquals(expected, actual);
    }

    @Test
    public void decelerateTargetSpeedRaise(){
        honda.setCurrentSpeed(70);
        int expected = 40;
        int actual = carService.decelerate(40, honda);
        assertEquals(expected, actual);
    }

    @Test
    public void decelerateCurrentSpeedRaise(){
        honda.setCurrentSpeed(85);
        int expected = 50;
        int actual = carService.decelerate(50, honda);
        assertEquals(expected, actual);
    }

    @Test
    public void isDriving() {
        honda.setCurrentSpeed(50);
        assertTrue(carService.isDriving(honda));
    }

    @Test
    public void isStopped() {
        honda.setCurrentSpeed(0);
        assertTrue(carService.isDriving(honda));
    }

    @Test
    public void canAccelerate() {
        honda.setCurrentSpeed(30);
        honda.setMaxSpeed(50);
        assertTrue(carService.isDriving(honda));
    }
}