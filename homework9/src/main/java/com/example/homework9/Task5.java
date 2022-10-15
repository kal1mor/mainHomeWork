package com.example.homework9;

import java.util.Arrays;

public class Task5 {

        void arrayFilling() {
            int[] mas = new int[12];
            int index = 0;
            int maxValue = 0;
            for (int i = 0; i <= mas.length-1; i++) {
                mas[i] = (int) (Math.random() * 15);
                if (mas[i] > maxValue){
                    maxValue = mas[i];
                    index = i;
                }
            }

            System.out.println("Maximum value: " + maxValue + "\nMaximum value index: " + index);

        }

}