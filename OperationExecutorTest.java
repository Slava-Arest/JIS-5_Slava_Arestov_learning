import org.junit.Test;

import static org.junit.Assert.*;

public class OperationExecutorTest {

    @Test
    public void execute() {
        OperationExecutor operationExecutor = new OperationExecutor();
        MathOperation[] mathOperations = {
                new AdditionOperation(),
                new SubtractionOperation(),
                new MultiplicationOperation(),
                new DivisionOperation(),
        };

        operationExecutor.execute(mathOperations,10.0,2.0);

        assertEquals(12.0, mathOperations[0].compute(10.0,2.0), 0.0);
        assertEquals(8.0, mathOperations[1].compute(10.0,2.0), 0.0);
        assertEquals(20.0, mathOperations[2].compute(10.0,2.0), 0.0);
        assertEquals(5.0, mathOperations[3].compute(10.0,2.0), 0.0);
    }
    }