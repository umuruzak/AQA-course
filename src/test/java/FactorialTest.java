import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void lessThanZeroThrowsIllegalArgument(){
        assertThrows(IllegalArgumentException.class, () -> Factorial.getFactorial(-1));
    }

    @Test
    void zeroShouldEqualOne(){
        assertEquals(1, Factorial.getFactorial(0));
    }

    @Test
    void oneShouldEqualOne(){
        assertEquals(1, Factorial.getFactorial(1));
    }

    @Test
    void fiveShouldNotEqualOne(){
        assertNotEquals(1, Factorial.getFactorial(5));
    }

    @Test
    void fiveShouldEqualOneTwenty(){
        assertEquals(120, Factorial.getFactorial(5));
    }
}