package com.example;

import java.util.Scanner;

public class StudentIDArray {

    String[] idList = new String[]{
            "000000001",
            "000000002",
            "000000003",
            "000000004",
            "000000005",
            "000000006",
            "000000007",
    };

    String[] firstNames = new String[]{
            "Kaung",
            "Nyi",
            "Myat",
            "Khin",
            "Yune",
            "Lal",
            "Shwe",
    };

    float[] gradePointAverageList = new float[]{
            10.1f,
            10.5f,
            11.3f,
            12.1f,
            12.9f,
            13.4f,
            13.8f,
    };

    private String getInputId() {
        System.out.print("Enter student's id: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private int findDesireStudentId(String id) {
        int atIndex = -1;
        for (int i = 0, length = idList.length; i < length; i++) {
            if (idList[i].equals(id)) {
                atIndex = i;
                break;
            }
        }
        return atIndex;
    }

    private String getStudentNameByIndex(int index) {
        return firstNames[index];
    }

    private float getStudentAverageGradePointByIndex(int index) {
        return gradePointAverageList[index];
    }

    public static void main(String[] args) {
        StudentIDArray program = new StudentIDArray();

        String input;
        int atIndex;

        do {
            input = program.getInputId();
            atIndex = program.findDesireStudentId(input);
            if (atIndex != -1) {
                System.out.printf("First Name = %s\nAverage Grade Point = %.2f.", program.getStudentNameByIndex(atIndex), program.getStudentAverageGradePointByIndex(atIndex));
            } else {
                System.out.println("No Match!");
            }
        } while (atIndex == -1);

    }


}
