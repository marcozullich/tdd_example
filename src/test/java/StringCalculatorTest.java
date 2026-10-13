import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {


    @Test
    void calculateNoOperationsZero(){
        assertEquals(0.0, StringCalculator.calculate("0"));
    }

    @Test
    void calculateNoOperationsReflectUserInput(){
        String input = "1.2344";
        assertEquals(1.2344, StringCalculator.calculate(input));
    }
}
