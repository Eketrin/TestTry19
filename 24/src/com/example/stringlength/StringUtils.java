package com.example.stringlength;

public class StringUtils {

    /**
     * Метод для подсчета количества букв в строке.
     * @param input строка, в которой нужно подсчитать количество букв
     * @return количество букв в строке
     */
    public static int countLetters(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Строка не может быть null");
        }

        int letterCount = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }
        return letterCount;
    }
}
