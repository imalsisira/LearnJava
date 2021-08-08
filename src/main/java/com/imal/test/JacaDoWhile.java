package com.imal.test;

import java.util.Scanner;

public class JacaDoWhile {

    public static void main(String[] args) {
        /*int i = 1;
        int n = 10;
        do{
            System.out.println(i);
            i++;
        }while (i<=n);*/

        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a positive number");
        int number = input.nextInt();
        do {
            sum+=number;
            System.out.println("please enter a positive number");
            number = input.nextInt();
        }while (number >=0);
        System.out.println(sum);
        input.close();
    }
}
