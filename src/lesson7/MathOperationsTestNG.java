package lesson7;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

public class MathOperationsTestNG {

    private MathOperations mathOps;

    @BeforeMethod
    public void setUp() {
        mathOps = new MathOperations();
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(mathOps.factorial(5), 120);
        Assert.expectThrows(IllegalArgumentException.class, () -> mathOps.factorial(-1));
    }

    @Test
    public void testTriangleArea() {
        Assert.assertEquals(mathOps.triangleArea(4, 5), 10.0, 0.0001);
        Assert.expectThrows(IllegalArgumentException.class, () -> mathOps.triangleArea(-1, 5));
    }

    @Test
    public void testArithmeticOperations() {
        Assert.assertEquals(mathOps.sum(7, 3), 10);
        Assert.assertEquals(mathOps.subtract(7, 3), 4);
        Assert.assertEquals(mathOps.multiply(7, 3), 21);
        Assert.assertEquals(mathOps.divide(5, 2), 2.5, 0.0001);
        Assert.expectThrows(ArithmeticException.class, () -> mathOps.divide(5, 0));
    }

    @Test
    public void testCompare() {
        Assert.assertEquals(mathOps.compare(10, 5), 1);
        Assert.assertEquals(mathOps.compare(3, 7), -1);
        Assert.assertEquals(mathOps.compare(5, 5), 0);
    }
}
