package com.day2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumAverage {
    //Find sum and average from an array
    /*
    Write a program that asks the user to input five integers and stores them in an array.
     The program should then find and print the sum and average of the values in the array.
     */


        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the length :");
            int n=sc.nextInt();
            int[] arr=new int[n];

            int sum=0;
            double average=0;
            System.out.println("Enter the numbers :");
            for(int i=0;i<arr.length;i++) {
               arr[i]=sc.nextInt();
            }
            for(int j=0;j<arr.length;j++)
            {
               sum=sum+arr[j];
               average=sum/ arr.length;

            }
            System.out.println("Sum :"+sum);
            System.out.println("Average :"+average);


        }
        }
