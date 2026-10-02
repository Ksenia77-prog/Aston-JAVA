package lesson7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsTest {

    private MathOperations mathOps;

    @BeforeEach
    void setUp() {
        mathOps = new MathOperations();
    }

    @Test
    void testFactorial() {
        assertEquals(120, mathOps.factorial(5));
        assertThrows(IllegalArgumentException.class, () -> mathOps.factorial(-1));
    }

    @Test
    void testTriangleArea() {
        assertEquals(10.0, mathOps.triangleArea(4, 5), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> mathOps.triangleArea(-1, 5));
    }

    @Test
    void testArithmeticOperations() {
        assertEquals(10, mathOps.sum(7, 3));
        assertEquals(4, mathOps.subtract(7, 3));
        assertEquals(21, mathOps.multiply(7, 3));
        assertEquals(2.5, mathOps.divide(5, 2), 0.0001);
        assertThrows(ArithmeticException.class, () -> mathOps.divide(5, 0));
    }

    @Test
    void testCompare() {
        assertEquals(1, mathOps.compare(10, 5));
        assertEquals(-1, mathOps.compare(3, 7));
        assertEquals(0, mathOps.compare(5, 5));
    }
}