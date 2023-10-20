package com.example;

public class Yards {

    int length = 25;
    int width = 42;

    public float calculateArea() {
        float yard = 9f;
        return (length * width) / yard;
    }

    public float calculateTotalCost() {
        float carpetingPrice = 10.5f;
        return calculateArea() * carpetingPrice;
    }

    public void displayTotalCost() {
        System.out.println("Carpeting price for length " + length + " width " + width + " is " + calculateTotalCost());
    }

    public static void main(String[] args) {
        Yards yards = new Yards();
        yards.displayTotalCost();
    }

}
