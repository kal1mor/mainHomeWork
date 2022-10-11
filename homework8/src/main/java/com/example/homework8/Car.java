package com.example.homework8;

public class Car {

    private String brand;
    private String speed;
    private String coast;

    Car(String brand, String speed, String coast) {
        this.brand = brand;
        this.speed = speed;
        this.coast = coast;
        System.out.println(brand + " " + speed + "km/h " + coast + "$");
    }


    public String getBrand() {
        return brand;

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getCoast() {
        return coast;
    }

    public void setCoast(String coast) {
        this.coast = coast;
    }

    void start() throws CantStartCar {
        int randomNumber = (int) (Math.random() * 20);
        if (randomNumber % 2 == 0) {
            throw new CantStartCar("The car is not start, try again\n");
        } else {
            System.out.println("The car is running\n");
        }


    }
}
