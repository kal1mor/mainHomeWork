package com.example.homework7;

public class Homework7 {


    public static void main(String[] args) {
        Year year = new Year();

        System.out.println(year.summer.aboutSeason);
        year.season(year.summer);
        System.out.println(year.getDescription());


        for (SeasonOfTheYear seasonOfTheYear : SeasonOfTheYear.values()) {
            System.out.println("Season: " + seasonOfTheYear + ". Average temperature of the season: " + seasonOfTheYear.avgTemperature);
        }

    }

}