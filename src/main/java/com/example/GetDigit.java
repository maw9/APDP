package com.example;

import java.util.Scanner;

public class GetDigit {

    private boolean isDigit(String input) {
        boolean isDigit = true;
        char currentChar;

        for (int i = 0, length = input.length(); i < length; i++) {
            currentChar = input.charAt(i);
            if (currentChar < 48 || currentChar > 57) {
                isDigit = false;
                break;
            }
        }

        return isDigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String inputDigit = sc.next();

        GetDigit program = new GetDigit();

        if (!program.isDigit(inputDigit)) {
            System.out.println("Input character is not a digit");
        } else {
            System.out.println("Input character is a digit");
        }

    }

}
