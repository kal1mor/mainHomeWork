package com.example.homework9;

import java.util.Arrays;

public class Task3 {
    void arrayFilling() {
        int[] mas = new int[15];
        int evenNumbers = 0;
        for (int i = 0; i <= mas.length - 1; i++){
            mas[i] = (int) (Math.random() * 99);
            if (mas[i] % 2 == 0){
                evenNumbers++;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("The number of even numbers in the array " + evenNumbers);

    }
}
