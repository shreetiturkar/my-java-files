package com.company;
//Write a program in java to display n terms of natural number and their sum
import java.util.Scanner;

//Write a program in C to display n terms of natural number and their sum
public class for_loop_p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your num: ");
        int num = sc.nextInt();
        int sum=0;

        for(int i=1; i<=num;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=0; i<=num;i++){
            sum+=i;
        }
        System.out.println("The sum of n natural number is : "  +sum);
    }
}
