package app;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculation {
    private static final Logger logger = LoggerFactory.getLogger(Calculation.class);
    public static int add(int a,int b){
        logger.info("Adding a = {}, b = {}",a,b);
        int res = a + b;
        logger.info("Res = {}", res);
        return res;
    }
    public static int subtract(int a,int b){
        logger.info("Subtracting a = {}, b = {}",a,b);
        int res = a - b;
        logger.info("Res = {}", res);
        return res;
    }
    public static int multiply(int a,int b){
        logger.info("Multiplying a = {}, b = {}",a,b);
        int res = a * b;
        logger.info("Res = {}", res);
        return res;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        logger.info("Dividing a = {}, b = {}",a,b);
        if( b == 0){
            logger.error("Division by zero");
            throw new ArithmeticException("Division by zero");
        }
        int res = a/b;
        logger.info("Res = {}", res);
        return res;
    }
}
