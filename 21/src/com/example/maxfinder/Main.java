package com.example.maxfinder;
/**
 * Основной класс для проверки работы метода.
 */
public class Main {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 9, 2};
        int max = ArrayUtils.findMax(numbers);
        System.out.println("Наибольшее число в массиве: " + max);
    }
}
