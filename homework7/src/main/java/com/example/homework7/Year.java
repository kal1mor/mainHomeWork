package com.example.homework7;

public class Year {


    SeasonOfTheYear summer = SeasonOfTheYear.SUMMER;
    SeasonOfTheYear winter = SeasonOfTheYear.WINTER;
    SeasonOfTheYear spring = SeasonOfTheYear.SPRING;
    SeasonOfTheYear autumn = SeasonOfTheYear.AUTUMN;
    void season (SeasonOfTheYear seasonOfTheYear){
        switch (seasonOfTheYear) {
            case SUMMER:
                System.out.println("I like summer");
                break;
            case WINTER:
                System.out.println("I like winter");
                break;
            case SPRING:
                System.out.println("I like spring");
                break;
            case AUTUMN:
                System.out.println("I like autumn");
                break;
        }


    }

    String getDescription (){
        if (summer == SeasonOfTheYear.SUMMER) {
            return "warm season";
        } else {
            return "cold season";
        }

    }
}
