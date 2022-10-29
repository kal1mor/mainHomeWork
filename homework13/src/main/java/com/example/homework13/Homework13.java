package com.example.homework13;

public class Homework13 {

    public static void main(String[] args) {

        ExThread exThread = new ExThread();
        exThread.start();
        ImplThread implThread = new ImplThread();
        Thread thread = new Thread(implThread);
        thread.start();

        Thread thread1 = new Thread(){
            @Override
            public void run() {
                System.out.println("Anonym thread");;
            }
        };
        thread1.start();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonym Runnable");
            }
        };
        Thread thread2 = new Thread(runnable);
        thread2.start();

    }

}
