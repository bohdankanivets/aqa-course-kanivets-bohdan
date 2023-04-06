package com.course.syntax;

import java.util.Scanner;

public class StepThird {

    public static void main(String[] args) {

        //Task 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int value: ");
        int var1 = scanner.nextInt();

        if (var1 < 10 && var1 != 0) {
            System.out.println("first message");
        }
        if (var1 > 10 ) {
            System.out.println("second message");
        }
        if (var1 == 0) {
            System.out.println("third message");
        }

        //Task 2
        System.out.print("Enter double value: ");
        double var2 = scanner.nextDouble();
        if (var2 % 2 == 0) {
            System.out.println("first message");
        } else {
            System.out.println("second message");
        }

        //Task 3
        System.out.print("Enter float value: ");
        float var3 = scanner.nextFloat();
        if (var3 % 2 == 0 && var3 > 10 || var3 == 15) {
            System.out.println("first message");
        } else {
            System.out.println("second message");
        }

    }
}
