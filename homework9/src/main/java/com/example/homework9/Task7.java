package com.example.homework9;

import java.util.Arrays;

public class Task7 {
    void arrayFilling() {
        int[] mas = new int[]{88, 39, 22, 44, 65, 1, 12, 54, 67, 20, 2, 9, 39};


        System.out.println("Unsorted massive:\n" + Arrays.toString(mas));


            for (int i = 1; i < mas.length; i++) {
                int current = mas[i];
                int newValue = i -1;
                while (newValue >= 0 && current < mas[newValue]){
                    mas[newValue + 1] = mas[newValue];
                    newValue--;
                }
                mas[newValue + 1]= current;
            }

        System.out.println("Sorted massive:\n" + Arrays.toString(mas));
    }
}
