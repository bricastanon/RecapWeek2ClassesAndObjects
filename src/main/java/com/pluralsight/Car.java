package com.pluralsight;

public class Car {
    // Field (Keyword - private or public
    // Field attributes
    private String model;
    private double weight;
    private double price;
    private String color;
    private String purpose;
    private int year;

    // Making a Constructor
    public Car(String model, double weight, String color, double price, int year, String purpose) {

        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative ");
        }
        if (weight < 0) {
            throw new IllegalArgumentException("Price cannot be negative ");
        }
        // ^Adding if statements juts for examples^
        this.model = model;
        this.weight = weight;
        this.color = color;
        this.price = price;
        this.year = year;
        this.purpose = purpose; // Have to add all this in order for it to run and show info
    }
    // Empty Constructor
    public Car() {
        this.model = "Unknown";
        this.color = "Unknown";
        this.price = 0.0;
        this.weight = 0.0;
        this.purpose = "Unknown";
        this.year = 0;

    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getYear() {
        return year;
    }

    public void setPrice(double price) {
        if (price < 0){
            if (price < 0)
            {
                throw new IllegalArgumentException("Price cannot be negative");
            }
            this.price = price;
        }
        // ^^ Adding if statements just for examples ^^

        /*    System.out.println("This isn't possible. Please input a value greater than 0. ");
        } else {
            this.price = price;
        }
        ^^ can also do this instead of the illegal statement ^^
        */

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Create a new method that shows car information
    public void carInformation()
    {
       // System.out.println("Make: " + this.model + "\n" + "Weight: " + this.weight + "\n" + "Color: " + this.color + "\n" + "Price: " + "$" + this.price + "\n" + "Year: " + this.year);
        System.out.println("Model: " + this.model);
        System.out.println("Weight: " + this.weight);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + "$" + this.price);
        System.out.println("Purpose of car: " + this.purpose);
        System.out.println("Year: " + this.year);
    }

    // OVERRIDE
        public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ",weight=" +
                weight + ", price=" + price +
                ", color='" + color + '\'' +
                ", purpose='" + purpose + '\'' +
                ", year=" + year +
                '}';
        // this is for c3.getColor().toString(); on Main.java idk what this actually does^^
        }



}

