package com.example.homework7;

public enum SeasonOfTheYear {
    SUMMER (20, "It's my favorite season"),
    WINTER (-10),
    SPRING(12),
    AUTUMN (11);
//    AVERAGE_TEMPERATURE_OF_SUMMER,
//    AVERAGE_TEMPERATURE_OF_WINTER,
//    AVERAGE_TEMPERATURE_OF_SPRING,
//    AVERAGE_TEMPERATURE_OF_AUTUMN
    int avgTemperature;
    String aboutSeason;
         SeasonOfTheYear(int avgTemperature, String aboutSeason){
            this.avgTemperature = avgTemperature;
            this.aboutSeason = aboutSeason;
    }
    SeasonOfTheYear(int avgTemperature){
        this.avgTemperature = avgTemperature;
    }

}
