import org.junit.*;

import static org.junit.Assert.*;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        int expected = 4;
        int actual = calculator.sum(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testDifference() {
        int expected = 0;
        int actual = calculator.difference(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testMultiply() {
        int expected = 4;
        int multiply = calculator.multiply(2, 2);
        assertEquals(expected, multiply);
    }

    @Test
    public void testDivide() {
        int expected = 1;
        int actual = calculator.divide(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void testDivideByZero() {
        Class<IllegalArgumentException> expected = IllegalArgumentException.class;
        String expectedErrorMessage = "Nu se poate impartirea la 0";

        IllegalArgumentException actual = assertThrows(expected, () -> calculator.divide(2, 0));
        assertEquals(expectedErrorMessage, actual.getMessage());
    }
}
