package com.example.lib;

public class birds {
    int speedFly;
    String colorOfBird;

    public static void main(String[] args) {
        Crow crow = new Crow();
        Pigeon pigeon = new Pigeon();
        pigeon.fly();
        pigeon.setColorOfBird();
        crow.fly();
        crow.setColorOfBird();
    }
    void fly() {
        System.out.println("My speed equal: " + speedFly + "km/h");
    }

    void setColorOfBird() {
        System.out.println("My color is: " + colorOfBird);
    }

}

class Crow extends birds{

    @Override
    void fly() {
        System.out.println("Crow:");
        speedFly = 100;
        super.fly();
    }

    @Override
    void setColorOfBird() {
        colorOfBird = "black";
        super.setColorOfBird();
    }
}

class Pigeon extends birds{

    @Override
    void fly() {
        System.out.println("Pigeon:");
        speedFly = 50;
        super.fly();
    }

    @Override
    void setColorOfBird() {
        colorOfBird = "white";
        super.setColorOfBird();
    }
}