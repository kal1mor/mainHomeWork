package com.example.homework12;

import java.util.ArrayList;
import java.util.Comparator;

public class Homework12 {
    public static void main(String[] args) {
        Children children = new Children(12 , "Arthas", 168);
        ChildrenBecomeAnAdult<Children, Adult> childrenBecomeAnAdult;
        childrenBecomeAnAdult = child -> new Adult(25, "Arthas", 190);
        Adult adult = childrenBecomeAnAdult.adultChildren(children);
        System.out.println(adult);
        System.out.println();

        ArrayList<Adult> adultList = new ArrayList<>();
        adultList.add(new Adult(18, "Odin", 185));
        adultList.add(new Adult(20, "John", 169));
        adultList.add(new Adult(23, "Wick", 174));
        adultList.add(new Adult(70, "Antony", 125));
        String mostOldest = adultList.stream().skip(1).limit(2).max(Comparator.comparing(Adult::getAge)).get().getName();
        System.out.print(mostOldest);
    }
}