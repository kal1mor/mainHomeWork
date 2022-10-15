package com.example.homework9;

import java.util.Arrays;

public class Task4 {
    void arrayFilling() {
        int[] mas = new int[20];
        for (int i = 0; i <= mas.length - 1; i++) {
            mas[i] = (int) (Math.random() * 20);
        }
        System.out.println("Unmodified array:\n" + Arrays.toString(mas));
        for (int i = 0; i <= mas.length - 1; i++) {
            if (mas[i] % 2 != 0) {
                mas[i] = 0;
            }
        }
        System.out.println("Odd numbers in array replaced with:\n" + Arrays.toString(mas));
    }
}
