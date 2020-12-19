package hardTests;

import application.Calculator;
import category.Regular;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category(Regular.class)
public class HardTestClass {

    private Calculator calc = new Calculator();

    @Test
    public void sumOfParameters() {
        int actualResult = calc.sumOfParameters(0, 3, 5);
        assertEquals(8, actualResult);
    }

    @Test
    public void divideByZero() {
        int actualResult = calc.divideByZeroCase(10, 0);
        assertEquals(-100, actualResult);
    }

}
