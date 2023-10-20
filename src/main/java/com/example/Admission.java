package com.example;

public class Admission {

    private boolean isStudentEligibleForAdmission(float gradePointAvg, int testScore) {
        return (gradePointAvg >= 2.0 && testScore >= 90) || (gradePointAvg >= 2.6 && testScore >= 80) || (gradePointAvg >= 3.0 && testScore >= 70) || (gradePointAvg >= 3.6 && testScore >= 60);
    }

    public static void main(String[] args) {
        Admission program = new Admission();

        float gradePointAvg = 1.5f;
        int testScore = 71;

        if (program.isStudentEligibleForAdmission(gradePointAvg, testScore)) {
            System.out.println("Accept");
        } else {
            System.out.println("Reject");
        }

    }

}
