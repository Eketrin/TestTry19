package com.example.countdigits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testCountDigitsWithOnlyDigits() {
        int result = StringUtils.countDigits("123456");
        assertEquals(6, result, "Количество цифр должно быть 6");
    }

    @Test
    void testCountDigitsWithAlphanumericString() {
        int result = StringUtils.countDigits("abc123def456");
        assertEquals(6, result, "Количество цифр должно быть 6");
    }

    @Test
    void testCountDigitsWithSpecialCharacters() {
        int result = StringUtils.countDigits("abc!@#123");
        assertEquals(3, result, "Количество цифр должно быть 3 (специальные символы игнорируются)");
    }

    @Test
    void testCountDigitsWithEmptyString() {
        int result = StringUtils.countDigits("");
        assertEquals(0, result, "Количество цифр в пустой строке должно быть 0");
    }

    @Test
    void testCountDigitsWithNullString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> StringUtils.countDigits(null));
        assertEquals("Строка не может быть null", exception.getMessage());
    }
}
