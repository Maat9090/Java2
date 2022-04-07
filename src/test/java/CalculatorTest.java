import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("2+1=3")
  void addTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(2,1));
    }
    @Test
    @DisplayName("2-1=1")
    void subtractTwoNumbers(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(2,1));
    }



}