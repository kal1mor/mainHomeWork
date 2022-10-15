package com.example.homework9;

public class Task2 {
    void arrayFilling() {
        int masLength = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                masLength++;
            }
        }
        int[] mas = new int[masLength];
        int c = 1;
        for (int i = 0; i <= mas.length - 1; i++) {

            if (c % 2 != 0){
                mas[i] = c;
            }
            c++;
            c++;
            System.out.print(mas[i] + " ");
        }
        System.out.println("\n");
        for (int i = mas.length - 1; i >= 0; i--){
            System.out.print(mas[i] + " ");
        }


    }
}
