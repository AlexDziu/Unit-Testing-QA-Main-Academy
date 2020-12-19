package simpleTests;

import application.Calculator;
import category.Regression;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category(Regression.class)
public class SimpleTestClass {

    private Calculator calc = new Calculator();

    @Test
    public void addTwoPositiveValues() {
        int actualResult = calc.add(10, 5);
        assertEquals("10 + 5 must be 15", 15, actualResult);
    }

    @Test
    public void subtraction() {
        int actualResult = calc.subtraction(2, 40);
        assertEquals(-38, actualResult);
    }

    @Test
    public void multiplication() {
        int actualResult = calc.multiplication(15, 2);
        assertEquals(30, actualResult);
    }

    @Test()
    public void division() throws ArithmeticException {
        double actualResult = calc.division(25, 0);
        assertEquals(0.0, actualResult, 0);
    }

    @Test
    public void squareRoot() {
        double actualResult = calc.squareRoot(5);
        assertEquals(1.25, actualResult, 1);
    }

    @Test
    public void powerNumbers() {
        double actualResult = calc.power(2, 3);
        assertEquals(8, actualResult, 1);
    }

}
