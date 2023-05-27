package com.course.syntax;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class StepFourth {

    public static void main(String[] args) {

        //Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive value: ");
        int var1 = scanner.nextInt();
        if (var1 > 0) {
            for (int i = 0; i <= var1; i++) {
                if (i % 3 == 0) {
                    System.out.println("The number multiple to 3: " + i);
                } else if (i % 2 == 0) {
                    System.out.println("The number is even " + i);
                }
            }
        } else {
            System.out.println("Number is negative");
        }

        //Task 2
        System.out.print("\nEnter value for calculate factorial: ");
        int var2 = scanner.nextInt();
        if (var2 >= 1) {
            int result = 1;
            for (int i = 1; i <= var2; i++) {
                result *= i;
            }
            System.out.println(result);
        } else {
            System.out.println("Value is incorrect");
        }

        //Task 3
        System.out.println("Enter value for look for the largest integer divisor: ");
        int var3 = scanner.nextInt();
        if (var3 % 2 == 0) {
            System.out.println(var3 / 2);
        } else {
            int sqrtResult = (int) sqrt(abs(var3));
            for (int i = 3; i <= sqrtResult; i += 2) {
                if (var3 % i == 0) {
                    System.out.println(i);
                } else {
                    System.out.println("No largest integer divisor for a given number");
                    break;
                }
            }
        }

        //Task 4
        int age;
        while (true) {
            System.out.println("Enter your age: ");
            age = scanner.nextInt();
            if (age > 0 && age < 140) {
                System.out.println("Your age is: " + age);
                break;
            } else {
                System.out.println("Your age is incorrect");
            }
        }


    }
}
