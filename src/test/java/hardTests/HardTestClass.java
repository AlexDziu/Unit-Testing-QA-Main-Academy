package hardTests;

import application.Calculator;
import category.Regular;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category(Regular.class)
public class HardTestClass {

    private Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - divide by zero case
    @Test
    public void testSumOfParameters() {
        int actualResult = calc.sumOfParameters(0, 3, 5);
        assertEquals(8, actualResult);
    }

    //TODO (**)
    //add tests for new method - addition with multiple parameters
    @Test
    public void testDivideByZeroCase() {
        int actualResult = calc.divideByZeroCase(10, 0);
        assertEquals(-100, actualResult);
    }

}
