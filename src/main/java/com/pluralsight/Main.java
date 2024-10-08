package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi Hi!");

        Car c1 = new Car("Dodge", 1000, "Red", 35000, 2021, "Need a car");
        Car c2 = new Car("Tesla", 1000,"White", 50000, 2024, "Love it");
        Car c3 = new Car("BMW", 1000, "Black", 55000, 2020, "Dream car");
        c1.setPrice(20000); //setting a new price
        c1.setModel("Tesla");
        c1.setColor("White");
        c1.setPurpose("Dream Car");
        c1.setWeight(1000);
        c1.setYear(2024);
        c1.setPrice(35000);
        c1.carInformation();// this runs the info from the new method

        c3.carInformation();

        // this is for wanting to get a specific value and not all the info
        String mycolor = c2.getColor();
        System.out.println(mycolor);

        int myage = 25;
        c3.getColor().toString(); // this is for the Car.java OVERRIDE idk what this actually does



    }
}