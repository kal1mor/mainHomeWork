package com.example.homework14;

import static java.lang.Thread.sleep;

public class Store {
    private int product = 0;
    synchronized void get() {
        while (product < 1){
            try{
                System.out.println();
                wait();
            } catch (InterruptedException e){
                System.out.println("get interrupted");
            }
        }
        product--;
        System.out.println("consumer bought 1 product");
        System.out.println("products available: " + product);
        notify();
    }

    synchronized void put(){
        while (product >= 1){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.print("get interrupted");
            }
        }
        try {
            System.out.println("\nwait, goods are produced");
            sleep(300);

        }catch (Exception e){
            System.out.println("get interrupted");
        }
        product++;
        System.out.println("producer made 1 product");
        System.out.println("products available: " + product);
        notify();
    }
}


