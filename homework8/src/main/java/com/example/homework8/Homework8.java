package com.example.homework8;

public class Homework8 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "250", "250000");
        try {
            car1.start();
        } catch (CantStartCar cantStartCar) {
            System.out.println(cantStartCar.getMessage());
        }

        Car car2 = new Car("Mercedes", "200", "200000");
        try {
            car2.start();
        } catch (CantStartCar cantStartCar) {
            System.out.println(cantStartCar.getMessage());
        }

        Car car3 = new Car("AUDI", "300", "300000");

        try {
            car3.start();
        } catch (CantStartCar cantStartCar) {
            System.out.println(cantStartCar.getMessage());
        }


    }
}