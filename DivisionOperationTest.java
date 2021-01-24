import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionOperationTest {

    @Test
    public void compute() {
        DivisionOperation divisionOperation = new DivisionOperation();
        double expected = 5.0;
        assertEquals(expected, divisionOperation.compute(10.0, 2.0), 0.0);
    }
}