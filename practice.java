package com.company;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of subject 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the marks of subject 2: ");
        int b = sc.nextInt();
        System.out.print("Enter the marks of subject 3: ");
        int c = sc.nextInt();
        System.out.print("Enter the marks of subject 4: ");
        int d = sc.nextInt();
        System.out.print("Enter the marks of subject 5: ");
        int e = sc.nextInt();
        double percentage = (a+b+c+d+e)/5.0;
        System.out.println(percentage);

    }

}
