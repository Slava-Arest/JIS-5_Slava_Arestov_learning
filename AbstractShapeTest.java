import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractShapeTest {


    @Test
    public void circleGetArea() {
        Circle circle = new Circle("Circle", 7.0);
        double expected = 153.86;
        assertEquals(expected, circle.getArea(), 0.0);
    }

    @Test
    public void squareGetArea() {
        Square square = new Square("Square", 5.0);
        double expected = 25;
        assertEquals(expected, square.getArea(), 0.0);
    }

    @Test
    public void triangleGetArea() {
        Triangle triangle = new Triangle("Triangle", 6.0, 4.0);
        double expected = 12;
        assertEquals(expected, triangle.getArea(), 0.0);
    }
}