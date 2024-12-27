package com.example.maxfinder;

/**
 * Класс для работы с массивами.
 */
public class ArrayUtils {

    /**
     * Находит наибольшее число в массиве.
     *
     * @param numbers массив чисел
     * @return наибольшее число
     * @throws IllegalArgumentException если массив пуст или равен null
     */
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
