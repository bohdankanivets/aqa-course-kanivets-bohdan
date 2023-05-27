package com.course.syntax;

import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;

public class StepFifth {

    public static void main(String[] args) {

        //Task 1
        int[] arr1 = {2, 331, 125, -123, 45};
        int sum = 0;
        for (int i:arr1) {
            sum += i;
        }
        System.out.println("Average value of given array: " + (float)sum/arr1.length);

        //Task 2
        int[] firstArr = {12, 123, 34, 22, 57, 13};
        int[] secondArr = {34, 65, 23, 66, 2};
        int sizeNewArr = firstArr.length + secondArr.length;
        int[] mergedArr = new int[sizeNewArr];
        int pos = 0;
        for (int i : firstArr) {
            mergedArr[pos] = i;
            pos++;
        }
        for (int i : secondArr) {
            mergedArr[pos] = i;
            pos++;
        }
        System.out.println("Merged 2 arrays: " + Arrays.toString(mergedArr));

        //Task 3
        int[] arr2 = {12, 123, 34, 22, 57, 13};
        int maxValueInArr = MIN_VALUE;
        for (int i : arr2) {
            if (i > maxValueInArr) {
                maxValueInArr = i;
            }
        }
        System.out.println("Biggest number in the arr: " + maxValueInArr);

        //Task 4
        int[] arr3 = {22, 123, 43, 12, 53, 1, 10, 46};
        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                int temp;
                if (arr3[i] > arr3[j]) {
                    temp = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = temp;
                }
            }
        }
        System.out.println("Sorted by asc given array: " + Arrays.toString(arr3));

        //Task 5
        int[] arr5 = {22, 123, 43, 12, 53, 1, 10, 46};
        boolean isSorted = false;
        int buf;
        System.out.println("Bubble sorting realization");
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr5.length - 1; i++) {
                if (arr5[i] > arr5[i+1]) {
                    isSorted = false;
                    buf = arr5[i];
                    arr5[i] = arr5[i+1];
                    arr5[i+1] = buf;
                }
            }
            System.out.println(Arrays.toString(arr5));
        }
    }
}
