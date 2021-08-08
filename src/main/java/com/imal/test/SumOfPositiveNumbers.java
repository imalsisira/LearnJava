package com.imal.test;

import java.time.Clock;
import java.util.Scanner;

public class SumOfPositiveNumbers {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a positive number");
        int number = scanner.nextInt();
        while (number >= 0){
            sum+=number;
            System.out.println("enter a positive number");
            number = scanner.nextInt();
        }
        System.out.println(sum);
        scanner.close();
    }
}
