package com.example;

public class Payroll {

    private float payRatePerHour = 15.5f;
    private float workingHour = 8f;

    private float calculateGrossPay() {
        return payRatePerHour * workingHour;
    }

    private float calculateNetPay() {
        float grossPay = calculateGrossPay();
        float tax = grossPay * 0.15f;
        return grossPay - tax;
    }

    private void displayNetPay() {
        System.out.printf("Net pay of pay rate per hour %.2f and hour worked %.2f is %.2f.", payRatePerHour, workingHour, calculateNetPay());
    }

    public static void main(String[] args) {
        Payroll payroll = new Payroll();
        payroll.displayNetPay();
    }

}
