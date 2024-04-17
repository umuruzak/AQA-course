import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialTest {
    @Test
    void lessThanZeroThrowsIllegalArgument(){
        assertThrows(IllegalArgumentException.class, () -> Factorial.getFactorial(-1));
    }

    @Test
    void zeroShouldEqualOne(){
        assertEquals(Factorial.getFactorial(0), 1);
    }

    @Test
    void oneShouldEqualOne(){
        assertEquals(Factorial.getFactorial(1), 1);
    }

    @Test
    void fiveShouldNotEqualOne(){
        assertNotEquals(Factorial.getFactorial(5), 1);
    }

    @Test
    void fiveShouldEqualOneTwenty(){
        assertEquals(Factorial.getFactorial(5), 120);
    }

}