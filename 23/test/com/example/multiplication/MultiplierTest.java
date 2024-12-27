package com.example.multiplication;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplierTest {

    @Test
    void testMultiplyPositiveNumbers() {
        int result = Multiplier.multiply(3, 5);
        assertEquals(15, result, "3 * 5 должно быть равно 15");
    }

    @Test
    void testMultiplyNegativeNumbers() {
        int result = Multiplier.multiply(-4, -6);
        assertEquals(24, result, "-4 * -6 должно быть равно 24");
    }

    @Test
    void testMultiplyPositiveAndNegative() {
        int result = Multiplier.multiply(7, -3);
        assertEquals(-21, result, "7 * -3 должно быть равно -21");
    }

    @Test
    void testMultiplyWithZero() {
        int result = Multiplier.multiply(0, 5);
        assertEquals(0, result, "0 * 5 должно быть равно 0");
    }

    @Test
    void testMultiplyLargeNumbers() {
        int result = Multiplier.multiply(1000, 1000);
        assertEquals(1000000, result, "1000 * 1000 должно быть равно 1000000");
    }
}
