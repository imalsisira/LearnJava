package com.imal.test;

import java.util.Scanner;

public class JavaContinue {
    public static void main(String[] args) {
        /*for (int i = 0;i<=10;i++){
            if (i>4 &&i<9){
                continue;
            }
            System.out.println(i);
        }*/

        Scanner scanner = new Scanner(System.in);

        Double number,sum = 0.0;
        for (int i=1;i<10;i++){
            System.out.println("enter number " + i + ":");
            number = scanner.nextDouble();
            if (number <=0.0){
                continue;
            }
            sum+=number;

        }
        System.out.println(sum + "------" + sum);
        scanner.close();
    }
}
