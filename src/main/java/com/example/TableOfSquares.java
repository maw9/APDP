package com.example;

public class TableOfSquares {

    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.printf("Square of %d is %d.", i, (int) Math.pow(i, 2));
            System.out.println();
        }
    }

}
