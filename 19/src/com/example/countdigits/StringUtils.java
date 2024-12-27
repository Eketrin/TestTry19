package com.example.countdigits;

public class StringUtils {

    /**
     * Метод для подсчета количества цифр в строке.
     * @param input строка, в которой нужно подсчитать количество цифр
     * @return количество цифр в строке
     */
    public static int countDigits(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Строка не может быть null");
        }

        int digitCount = 0;
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        return digitCount;
    }
}
