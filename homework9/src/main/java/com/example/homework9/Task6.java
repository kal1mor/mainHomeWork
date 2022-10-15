package com.example.homework9;

import java.util.Arrays;

public class Task6 {
    void arrayFilling() {
        int[] mas = new int[]{21, 71, 55, 20, 29, 5, 7, 10, 19, 18, 23, 70};
        boolean isSorted = false;
        int buf;
        System.out.println("Unsorted massive:\n" + Arrays.toString(mas));
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++){
                if (mas[i] > mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println("Sorted massive:\n" + Arrays.toString(mas));
    }
}
