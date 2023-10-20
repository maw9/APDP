package com.example;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Perfect {

    private boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Perfect program = new Perfect();

        System.out.println("Perfect Numbers");
        for (int i = 1; i <= 1000; i++) {
            if (program.isPerfectNumber(i)) {
                System.out.println("Perfect Number: " + i);
            }
        }
    }

}
