package com.company;
// Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places
import java.util.Scanner;
public class ifelse_p3 {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        double a  = sc.nextDouble();
        System.out.println("Enter your 2nd number: ");
        double b = sc.nextDouble();
        if(a==b){
            System.out.println("Both numbers are same.");
        }
        else{
            System.out.println("Both numbers are diffrent");
        }
    }
}
