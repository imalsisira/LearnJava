package com.imal.test;

import java.util.Arrays;

public class JavaSortArray {
    public static void main(String[] args) {
        int[] age = {2,6,1,12,56,9,23};
        Arrays.sort(age);
        for (int i=0;i<age.length;i++){
            System.out.println("age is "+age[i]);
        }

        for (int a : age){
            System.out.println(a);
        }
    }
}
