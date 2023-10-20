package com.example;

public class Dollars {

    // 20, 10, 5, 1
    private void displaySplitDollars(int inputDollar) {
        int original = inputDollar;
        int twentyDollarCount = 0;
        int tenDollarCount = 0;
        int fiveDollarCount = 0;
        int oneDollarCount = 0;

        while (inputDollar != 0) {
            if (inputDollar > 20) {
                twentyDollarCount = inputDollar / 20;
                inputDollar %= 20;
            } else if (inputDollar > 10) {
                tenDollarCount = inputDollar / 10;
                inputDollar %= 10;
            } else if (inputDollar > 5) {
                fiveDollarCount = inputDollar / 5;
                inputDollar %= 5;
            } else {
                oneDollarCount = inputDollar;
                inputDollar %= 1;
            }
        }

        System.out.printf("%d can be split into %d 20s, %d 10s, %d 5s, and %d 1s.", original, twentyDollarCount, tenDollarCount, fiveDollarCount, oneDollarCount);

    }

    public static void main(String[] args) {
        Dollars dollars = new Dollars();
        int inputDollar = 57;
        dollars.displaySplitDollars(inputDollar);
    }

}
