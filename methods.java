package com.company;

import java.util.Scanner;

public class methods {
    public static void add( double a, double b){
        System.out.println(a+b);
    }
    public static double sub(double a, double b){
        return a-b;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num1 = s.nextInt();
        double num2 = s.nextInt();
        add(num1, num2);
        System.out.println(sub(num1, num2));

    }
}



//PRATICE QUE
//public class methods {
//    public static double per( int a, int b, int c, int d, int e){
//        double total = a+b+c+d+e;
//        return total/5;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner t = new Scanner(System.in);
//        int a = t.nextInt();
//        int b = t.nextInt();
//        int c = t.nextInt();
//        int d = t.nextInt();
//        int e = t.nextInt();
//        System.out.println(per(a, b, c, d, e));
//    }
//
//}







