package com.example.Task1;

import java.util.Scanner;

public class Task1 {

    void massiveInitialization() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int masLength = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        int masCount = scanner.nextInt();
        int[][] massive = new int[masLength][masCount];


        for (int massive2D = 0; massive2D <= massive.length - 1; massive2D++){
            for (int massive1D = 0; massive1D <= massive[massive2D].length - 1; massive1D++){
                System.out.println("Enter element: ");
                massive[massive2D][massive1D] = scanner.nextInt();

            }
        }

        for (int[] massive1D : massive){
            for (int elemets : massive1D){
                System.out.println(elemets);
            }
            System.out.println();
        }

    }
}
