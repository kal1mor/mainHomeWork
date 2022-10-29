package com.example.homework13;

import static java.lang.Thread.sleep;

public class ImplThread implements Runnable{

    @Override
    public void run() {
        try {
            sleep(5000);
        }catch (Exception e) {}
        long start = System.currentTimeMillis();
        Thread thread = Thread.currentThread();
        System.out.println("Runnable " + thread + " " + start);
    }
}
