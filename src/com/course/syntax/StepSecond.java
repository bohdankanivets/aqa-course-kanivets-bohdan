package com.course.syntax;


public class StepSecond {

    public static void main(String[] args) {

        //Task 1
        int a = 4;
        int b = 13;
        int c = 15;
        float p = (a + b + c) / 2f;
        System.out.println("S = " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));

        //Task 2
        int n = 10;
        System.out.println("2 + n++ = " + (2 + n++));
        System.out.println("2 + ++n : " + (2 + ++n));
        System.out.println("2 + n-- = " + (2 + n--));
        System.out.println("2 + --n : " + (2 + --n));
    }
}
