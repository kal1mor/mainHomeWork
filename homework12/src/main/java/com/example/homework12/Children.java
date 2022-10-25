package com.example.homework12;

public class Children {
    private int age;
    private String name;
    private int growth;

    public Children(int age, String name, int growth) {
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
        return "Children{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", growth=" + growth +
                '}';
    }
}
