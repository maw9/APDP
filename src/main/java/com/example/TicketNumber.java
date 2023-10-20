package com.example;

import java.util.Scanner;

public class TicketNumber {

    private String getTicketNumberFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ticket number: ");
        return sc.next();
    }

    private boolean validateTicketNumberLength(String ticketNumber) {
        int length = ticketNumber.length();
        return (length >= 10 && length <= 12);
    }

    private boolean validateTicketNumber(String ticketNumber) {
        int length = ticketNumber.length();
        int lastDigit = Integer.parseInt(ticketNumber.substring(length - 1));
        int frontDigits = Integer.parseInt(ticketNumber.substring(0, length - 1));

        int remainder = frontDigits % 7;

        return remainder == lastDigit;
    }

    public static void main(String[] args) {

        TicketNumber ticketNumber = new TicketNumber();
        String inputTicketNumber;

        do {

            inputTicketNumber = ticketNumber.getTicketNumberFromUser();

            if (ticketNumber.validateTicketNumberLength(inputTicketNumber) && ticketNumber.validateTicketNumber(inputTicketNumber)) {
                System.out.println("Entered ticket number is valid.");
            } else {
                System.out.println("Entered ticket number is invalid.");
            }

        } while (!ticketNumber.validateTicketNumberLength(inputTicketNumber) || !ticketNumber.validateTicketNumber(inputTicketNumber));

    }

}
