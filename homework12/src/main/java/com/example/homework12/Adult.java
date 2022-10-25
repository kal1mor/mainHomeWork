package com.example.homework12;

public class Adult {
    private int age;
    private String name;
    private int growth;


    public Adult(int age, String name, int growth) {
        this.age = age;
        this.name = name;
        this.growth = growth;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getGrowth() {
        return growth;
    }


    @Override
    public String toString() {
        String adultChildren = "The child became an adult";
        return    "age= " + age + ", name= " + name + ", growth=" + growth + ", adultChildren= " + adultChildren;
    }
}
