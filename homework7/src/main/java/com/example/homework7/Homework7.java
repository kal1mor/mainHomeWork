package com.example.homework7;

public class Homework7 {


    public static void main(String[] args) {
        Year year = new Year();

        System.out.println(year.summer);
        year.season(year.summer);
        System.out.println(year.getDescription());

        for (int i = 0; i<4; i++){
            if (i == 0){
                System.out.println(year.summer.avgTemperature + " ");
                year.season(year.summer);
                System.out.println("Its hottest time of the year");
            } else if (i == 1){
                System.out.println(year.winter.avgTemperature + " ");
                year.season(year.winter);
                System.out.println("Its coldest time of the year");
            } else if (i == 2){
                System.out.println(year.spring.avgTemperature + " ");
                year.season(year.spring);
                System.out.println("Its sunny time of the year");
            } else {
                System.out.println(year.autumn.avgTemperature + " ");
                year.season(year.autumn);
                System.out.println("Its rainy time of the year");
            }
        }

    }

}