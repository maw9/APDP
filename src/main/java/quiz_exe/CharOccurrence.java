package quiz_exe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CharOccurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        printCharOccurrenceOfGivenString(input);

        sc.close();
    }

    private static void printCharOccurrenceOfGivenString(String input) {
        Set<Character> foundChar = new HashSet<>();

        for (int i = 0, length = input.length(); i < length; i++) {
            if (input.charAt(i) == ' ')
                continue;

            foundChar.add(input.charAt(i));
        }

        System.out.print("{");
        for (Character each: foundChar) {
            ArrayList<Integer> foundIndexes = new ArrayList<>();
            System.out.print(each + "=[");
            for (int i = 0, length = input.length(); i < length; i++) {
                if (input.charAt(i) == each)
                    foundIndexes.add(i);
            }
            for (int i = 0, n = foundIndexes.size(); i < n; i++) {
                System.out.print(foundIndexes.get(i));
                if (i != n - 1)
                    System.out.print(",");
            }

            System.out.print("],");
        }
        System.out.print("}");
    }

}
