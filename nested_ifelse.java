package com.company;

import java.util.Scanner;

public class nested_ifelse {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter operand: ");
        char op = sc.next().charAt(0);
        if(op=='-') {
            if (num1 > num2) {
                System.out.println(num1 - num2);
            } else {
                System.out.println(num2 - num1);
            }
        }

        else{
                System.out.println("invalid");
            }
        }
    }

