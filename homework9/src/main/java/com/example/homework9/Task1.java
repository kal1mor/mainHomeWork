package com.example.homework9;

import java.util.Arrays;

public class Task1 {
    void arrayFilling() {
        int masLength = 0;
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                masLength++;
            }
        }
        int[] mas = new int[masLength];
        int c = 2;
        for (int i = 0; i <= mas.length - 1; i++) {

            if (c % 2 == 0){
                mas[i] = c;
            }
            c++;
            c++;
            System.out.print(mas[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i <= mas.length - 1; i++){
            System.out.println(mas[i]);
        }



    }
}
