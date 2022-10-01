package com.example.lib;


public class homeWork5 {

    public static void main(String[] args) {
    // Сокзание 3-х экземпляров классов
    phone Phone = new phone("+375295323632", "iphone 12", 12);
    phone Phone1 = new phone("+375296212523", "iphone 11");
    phone Phone2 = new phone();

    //Вывод значений переменных 3-х экземпляров классов
    System.out.println(Phone.number + " " + Phone.weight + " "  + Phone.model);
    System.out.println(Phone1.number + " " + Phone1.weight + " " + Phone1.model);
    System.out.println(Phone2.number + " " + Phone2.weight + " " + Phone2.model);
    System.out.println();

    // Вызов метода receiveCall
    Phone.receiveCall("Ignat");
    Phone1.receiveCall("Artur", "+375296212532");
    Phone2.receiveCall("Elena");
    System.out.println();

    // Вызов метода getNumber
    Phone.getNumber();
    Phone1.getNumber();
    Phone2.getNumber();
    System.out.println();

    //Вызов метода sendMessage
    Phone.sendMessage("+375295323632");
    }
}

class phone{
    String number;
    String model;
    int weight;
    String callerName;

    public phone (String number, String model, int weight){
        this(number, model);  //Вызов конструктора с двумя параметрами
        this.weight = weight;
    }

    public  phone (String number, String model){
    this.number = number;
    this.model = model;
    }

    public phone (){
    }

    void receiveCall (String callerName){
        this.callerName = callerName;
        System.out.println("Calling " + callerName);
    }

    void receiveCall (String callerName, String number){
        this.callerName = callerName;
        this.number = number;
        System.out.println("Calling " + callerName + " with number " + number);
    }

    String getNumber (){
        System.out.println(number);
        return number;
    }

    void sendMessage(String number){
        this.number = number;
        if (number.length() == 13) {
            System.out.println("Send message to this number: " + number);
        } else {
            System.out.println("Don't find number");
        }
    }
}