package com.company;


import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num1 = t.nextInt();
        int num2 = t.nextInt();
        System.out.print("Enter operand: ");
        char op = t.next().charAt(0);

        switch (op){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '*':
                System.out.println(num1*num2);
            default:
                System.out.println("incorrect oprand");
        }
    }
}
