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

    @Test
    public void averageValue() {
        int actualResult = calc.averageValue(2, 3, 10);
        assertEquals(5, actualResult);
    }

    @Test
    public void evenOrOddNumbers() {
        assertTrue(calc.evenOrOddNumbers(2));
        assertFalse(calc.evenOrOddNumbers(1));
    }

    @Test
    public void biggestValue() {
        int actualResult = calc.biggestValue(45, 4);
        assertEquals(45, actualResult);
    }

}
