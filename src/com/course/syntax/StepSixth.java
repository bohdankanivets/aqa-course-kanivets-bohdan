package com.course.syntax;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

public class StepSixth {

    public static void main(String[] args) {

        //Task 1
        Scanner scanner = new Scanner(in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine().replace(" ", "").toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        //Task 2
        String s1 = "check, that sentence contains word ava, if yes - reverse the string and print";
        String rev = "";
        if (s1.contains("java")) {
            for (int i = s1.length() - 1; i >= 0; i--) {
                rev += s1.charAt(i);
            }
            System.out.println(rev);
        } else {
            String[] arrStr = s1.split("\\s");
            System.out.println("Each even word must be uppercase: \n" + s1);
            for (int i = 0; i <= arrStr.length - 1; i++) {
                if (i % 2 == 0) {
                    System.out.print(arrStr[i].toUpperCase() + " ");
                } else {
                    System.out.print(arrStr[i] + " ");
                }
            }
        }

        //Task 3
        System.out.println("Enter string for counting letters: ");
        String s3 = scanner.nextLine().replaceAll("[^a-zA-Z]", "");
        System.out.println("Enter letters for counting separator - space : ");
        String[] lettersArray = scanner.nextLine().split(" ");
        int quantity = 0;
        for (int i = 0; i <= lettersArray.length - 1; i++) {
            for (int j = 0; j <= s3.length() - 1; j++) {
                if (lettersArray[i].charAt(0) == s3.charAt(j)) {
                    quantity++;
                }
            }
            System.out.println("Quantity " + lettersArray[i] + "letters in the sentence: " + quantity);
            quantity = 0;
        }

        //Task 4
        System.out.println("Enter sentence in PascalCase: ");
        String s4 = scanner.nextLine();
        char[] arrChar = s4.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrChar.length - 1; i++) {
            if (arrChar[i] >= 65  && arrChar[i] <= 90) {
                result.append(" ").append(arrChar[i]);
            } else {
                result.append(arrChar[i]);
            }
        }
        System.out.println("From PascalCase to spase before each letter : " + result.toString().trim());
    }
}
