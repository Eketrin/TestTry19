package com.example.countspecialchars;

public class StringUtils {

    /**
     * Метод для подсчета количества специальных символов в строке.
     * Специальные символы: любые символы, которые не являются буквами или цифрами.
     * @param input строка, в которой нужно подсчитать количество специальных символов
     * @return количество специальных символов в строке
     */
    public static int countSpecialChars(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Строка не может быть null");
        }

        int specialCharCount = 0;
        for (char c : input.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) { // Проверка на спецсимволы
                specialCharCount++;
            }
        }
        return specialCharCount;
    }
}
