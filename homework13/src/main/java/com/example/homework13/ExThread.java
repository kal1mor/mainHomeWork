package com.example.homework13;

public class ExThread extends Thread{

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        Thread thread = Thread.currentThread();
        System.out.println("Thread " + thread + " " + start);
    }
}
