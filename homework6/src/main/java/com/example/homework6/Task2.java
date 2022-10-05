package com.example.homework6;

public class Task2 {
    public static void main(String[] args) {

    }
}

abstract class Transport {

    abstract void drive();


}

class Bike extends Transport{

    @Override
    void drive() {

    }
}

class Car extends Transport implements IBeep, IOnMotor{

    @Override
    void drive() {

    }

    @Override
    public void beep() {

    }

    @Override
    public void onMotor() {

    }
}

class Tractor extends Transport implements IBeep, IOnMotor{

    @Override
    void drive() {

    }

    @Override
    public void onMotor() {

    }

    @Override
    public void beep() {

    }
}

interface IOnMotor {

    void onMotor();

}

interface IBeep {

    void beep();

}