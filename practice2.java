package com.company;
import java.util.Scanner;

public class practice2 {
    public static double sgpa(double a){
        return (a*10)-7.5;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter your sgpa: ");
        double a = t.nextDouble();
        System.out.println((sgpa(a)));
    }
}
