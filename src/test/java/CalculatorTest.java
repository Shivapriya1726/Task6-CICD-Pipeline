import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int a = 5;
        int b = 7;
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        Assert.assertEquals(result, 12, "Addition result is incorrect");
    }

    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 3;
        Calculator calculator = new Calculator();
        int result = calculator.subtract(a, b);
        Assert.assertEquals(result, 7, "Subtraction result is incorrect");
    }
}
