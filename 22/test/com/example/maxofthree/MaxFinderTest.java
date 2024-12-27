package com.example.maxofthree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaxFinderTest {

    @Test
    void testFindMaxOfThreePositiveNumbers() {
        int result = MaxFinder.findMaxOfThree(3, 5, 7);
        assertEquals(7, result, "Наибольшее число должно быть 7");
    }

    @Test
    void testFindMaxOfThreeNegativeNumbers() {
        int result = MaxFinder.findMaxOfThree(-3, -5, -7);
        assertEquals(-3, result, "Наибольшее число должно быть -3");
    }

    @Test
    void testFindMaxOfThreeWithMixedSigns() {
        int result = MaxFinder.findMaxOfThree(3, -5, 7);
        assertEquals(7, result, "Наибольшее число должно быть 7");
    }

    @Test
    void testFindMaxOfThreeWithZero() {
        int result = MaxFinder.findMaxOfThree(0, 5, 3);
        assertEquals(5, result, "Наибольшее число должно быть 5");
    }

    @Test
    void testFindMaxOfThreeWithEqualNumbers() {
        int result = MaxFinder.findMaxOfThree(5, 5, 5);
        assertEquals(5, result, "Наибольшее число должно быть 5");
    }
}
