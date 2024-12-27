package com.example.maxofthree;

public class MaxFinder {

    /**
     * Метод для нахождения максимального из трёх чисел.
     * @param a первое число
     * @param b второе число
     * @param c третье число
     * @return наибольшее число
     */
    public static int findMaxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}
