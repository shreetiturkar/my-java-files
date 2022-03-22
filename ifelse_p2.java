package com.company;
//Take three numbers from the user and print the greatest number.
import java.util.Scanner;
public class ifelse_p2 {
    public static void main(String[] arge){
        Scanner t = new Scanner(System.in);
        System.out.println("Input a:");
        int a = t.nextInt();
        System.out.println("Input b:");
        int b = t.nextInt();
        System.out.println("Input c:");
        int c = t.nextInt();
        int num1;
        int num2;
        if(a>b){
            num1 =a;
        }
        else{
            num1 = b;
        }
        //*********************************************************************************
        if(a>c){
            num2 = a;
        }
        else{
            num2 =c;
        }
        //*********************************************************************************
        if(num1>num2){
            System.out.println("The greatest of the three numbers is: "+num1);
        }
        else{
            System.out.println("The greatest of the three numbers is: "+num2);
        }
    }
}
