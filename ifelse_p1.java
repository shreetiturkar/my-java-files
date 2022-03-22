package com.company;
// Write a Java program to get a number from the user and print whether it is positive or negative
import java.util.Scanner;
public class ifelse_p1 {
    public static void main(String[] arge){
        Scanner t = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = t.nextInt();
        if(number>0){
            System.out.println("Your number is positive.");

        }
        else
            System.out.println("your number is negative.");
        }
    }

