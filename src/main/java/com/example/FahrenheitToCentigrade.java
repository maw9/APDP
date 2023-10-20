package com.example;

public class FahrenheitToCentigrade {

    private float convertFahrenheitToCentigrade(float fahrenheit) {
        return ((float) 5 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        float fahrenheit = 98.6f;
        FahrenheitToCentigrade program = new FahrenheitToCentigrade();
        float centigrade = program.convertFahrenheitToCentigrade(fahrenheit);

        System.out.printf("%.2f Fahrenheit is equivalent to %.2f Centigrade.", 98.6f, centigrade);
    }

}
