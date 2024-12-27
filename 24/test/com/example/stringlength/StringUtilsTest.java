package com.example.stringlength;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    void testCountLettersWithOnlyLetters() {
        int result = StringUtils.countLetters("HelloWorld");
        assertEquals(10, result, "Количество букв должно быть 10");
    }

    @Test
    void testCountLettersWithSpaces() {
        int result = StringUtils.countLetters("Hello World");
        assertEquals(10, result, "Количество букв должно быть 10 (пробелы игнорируются)");
    }

    @Test
    void testCountLettersWithSpecialCharacters() {
        int result = StringUtils.countLetters("Hello@World!");
        assertEquals(10, result, "Количество букв должно быть 10 (специальные символы игнорируются)");
    }

    @Test
    void testCountLettersWithEmptyString() {
        int result = StringUtils.countLetters("");
        assertEquals(0, result, "Количество букв в пустой строке должно быть 0");
    }

    @Test
    void testCountLettersWithNullString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> StringUtils.countLetters(null));
        assertEquals("Строка не может быть null", exception.getMessage());
    }
}
