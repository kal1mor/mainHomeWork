package com.example.homework8;

public class CantStartCar extends Exception {

    private String message;

    CantStartCar(String message) {
        this.message = message;
        setMessage(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
