package com.company;
import java.util.Scanner;

public class swap {
//    public static double sgpa(double a){
//        return (a*10)-7.5;
//    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int a =10;
        int b= 20;
        int c;
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
        c=a;
        a=b;
        b=c;
        System.out.println("value after swapping a:"+a);
        System.out.println("value after swapping b:"+b);

//        System.out.println("Enter your sgpa: ");
//        double a = t.nextDouble();
//        System.out.println((sgpa(a)));
    }
}

