package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.Sumdigits;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumdigitsTest {

    @Test
    @DisplayName("Test with a single-digit number (should return the same number)")
    public void testSingleDigitNumber() {
        assertEquals(5, Sumdigits.sumDigitsfortest(5));
    }

    @Test
    @DisplayName("Test with a two-digit number")
    public void testTwoDigitNumber() {
        assertEquals(7, Sumdigits.sumDigitsfortest(16));
    }

    @Test
    @DisplayName("Test with a two-digit number that requires multiple iterations")
    public void testTwoDigitNumberMultipleIterations() {
        assertEquals(9, Sumdigits.sumDigitsfortest(99));
    }

    @Test
    @DisplayName("Test with a three-digit number")
    public void testThreeDigitNumber() {
        assertEquals(6, Sumdigits.sumDigitsfortest(123));  // Corrected expected result to 6
    }

    @Test
    @DisplayName("Test with a large number")
    public void testLargeNumber() {
        assertEquals(9, Sumdigits.sumDigitsfortest(999999999));
    }
}

