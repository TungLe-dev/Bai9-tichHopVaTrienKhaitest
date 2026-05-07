import app.Calculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculationTest {
    @Test
    public void testCalculation(){
        Assertions.assertThrows(ArithmeticException.class,()->{
            Calculation.divide(1,0);
        });
    }
    @Test
    public void testCalculation2(){
        Assertions.assertEquals(3,Calculation.add(4,0));
    }
}
