package com.day2;

import java.util.Arrays;
import java.util.Scanner;

/*
Write a program that asks the user to input ten integers and stores them in an array.
 The program should then find and print the smallest and largest values in the array
 */
public class FindLargeSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ldength of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int small=arr[0];
        int large=arr[4];

        System.out.println("Array largest element : " + small);
        System.out.println("Array smallest element : "+large);
    }
}