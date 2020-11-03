package mediumTests;

import application.Calculator;
import category.Smoke;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@Category(Smoke.class)
public class MediumTestClass {

    private Calculator calc = new Calculator();

    //TODO (**)
    //add tests for new method - average value
    @Test
    public void testAverageValue() {
        int actualResult = calc.averageValue(2, 3, 10);
        assertEquals(5, actualResult);
    }

    //TODO (**)
    //add tests for new method - even or odd
    @Test
    public void testEvenOrOddNumbers() {
        assertTrue(calc.evenOrOddNumbers(2));
        assertFalse(calc.evenOrOddNumbers(1));
    }

    //TODO (**)
    //add tests for new method - biggest value
    @Test
    public void testBiggestValue() {
        int actualResult = calc.biggestValue(45, 4);
        assertEquals(45, actualResult);
    }
    //TODO (**)
    //add tests for new method - average value

    //TODO (**)
    //add tests for new method - even or odd

    //TODO (**)
    //add tests for new method - biggest value

}
