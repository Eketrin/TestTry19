package com.example.countspecialchars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testCountSpecialCharsWithOnlySpecialChars() {
        int result = StringUtils.countSpecialChars("!@#$%^&*()");
        assertEquals(10, result, "Количество специальных символов должно быть 10");
    }

    @Test
    void testCountSpecialCharsWithAlphanumericString() {
        int result = StringUtils.countSpecialChars("abc123xyz");
        assertEquals(0, result, "Количество специальных символов должно быть 0");
    }

    @Test
    void testCountSpecialCharsWithMixedCharacters() {
        int result = StringUtils.countSpecialChars("abc!123@xyz#");
        assertEquals(3, result, "Количество специальных символов должно быть 3");
    }

    @Test
    void testCountSpecialCharsWithEmptyString() {
        int result = StringUtils.countSpecialChars("");
        assertEquals(0, result, "Количество специальных символов в пустой строке должно быть 0");
    }

    @Test
    void testCountSpecialCharsWithNullString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> StringUtils.countSpecialChars(null));
        assertEquals("Строка не может быть null", exception.getMessage());
    }
}
