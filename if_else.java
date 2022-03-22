package com.company;
import java.util.Scanner;

public class if_else {
    public static void main(String[] arges){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter your Age:");
        int age = t.nextInt();
        if(age>18){
            System.out.println("YOU ARE IN...");
        }
        else if(age<18){
            System.out.println("YOU ARE OUT");
        }
        else{
            System.out.println("YOU ARE 18..");
        }

    }
}
