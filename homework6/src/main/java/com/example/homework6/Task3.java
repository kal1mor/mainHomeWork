package com.example.homework6;

public class Task3 {
    public static void main(String[] args) {
        Cars car = new Cars(new RollWheel());
        car.carDrive();
    }
}

class Cars {

    IRollWheel iRollWheel;

    public Cars (IRollWheel iRollWheel) {
        this.iRollWheel = iRollWheel;
    }

    void carDrive() {
        System.out.println("Car riders");
        iRollWheel.rollWheel();
    }
}

class RollWheel implements IRollWheel {

    @Override
    public void rollWheel() {
        System.out.println("Wheels is rolling");
    }
}

interface IRollWheel {

    void rollWheel();

}