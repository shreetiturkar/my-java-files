package com.company;
//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

import java.util.Scanner;

public class ifelse_p4 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Enter any number from 1-7: ");
        int a = t.nextInt(); ;
        if(1==a){
            System.out.println("Sunday");
        }
        else if(2==a){
            System.out.println("Monday");
        }
        else if(3==a){
            System.out.println("Tuesday");
        }
        else if(4==a){
            System.out.println("Wednesday");
        }
        else if(5==a){
            System.out.println("Thusday");
        }
        else if(6==a){
            System.out.println("Friday");
        }
        else if(7==a){
            System.out.println("Saturday");
        }
    }
}
