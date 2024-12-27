package com.example.maxfinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тесты для класса ArrayUtils.
 */
public class ArrayUtilsTest {

    @Test
    void testFindMaxWithPositiveNumbers() {
        int[] numbers = {1, 5, 3, 9, 2};
        assertEquals(9, ArrayUtils.findMax(numbers), "Наибольшее число должно быть 9");
    }

    @Test
    void testFindMaxWithNegativeNumbers() {
        int[] numbers = {-10, -20, -3, -7};
        assertEquals(-3, ArrayUtils.findMax(numbers), "Наибольшее число должно быть -3");
    }

    @Test
    void testFindMaxWithSingleElement() {
        int[] numbers = {42};
        assertEquals(42, ArrayUtils.findMax(numbers), "Наибольшее число должно быть 42");
    }

    @Test
    void testFindMaxWithEmptyArrayThrowsException() {
        int[] numbers = {};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMax(numbers));
        assertEquals("Массив не должен быть пустым или null", exception.getMessage());
    }

    @Test
    void testFindMaxWithMixedNumbers() {
        int[] numbers = {-1, 0, 5, -10};
        assertEquals(5, ArrayUtils.findMax(numbers), "Наибольшее число должно быть 5");
    }
}
