package com.imal.test;

import java.util.Arrays;

public class JavaCopyArray {
    public static void main(String[] args) {
        /*int[] ages = {22,24,25,28,21};
        int[] copyOfAges = ages;
        for (int age : copyOfAges){
            System.out.println(age);
        }*/
        
        /*int[] numbers={4,5,6,7,2,3,12};
        int[] copy=new int[7];

        for (int i=0;i<numbers.length;i++){
            copy[i]=numbers[i];
        }
        System.out.println(Arrays.toString(copy));*/

        /*int[] array={1,2,3,4,5,6};
        int[] array1=new int[6];
        int[] array2=new int[array.length];

        System.arraycopy(array,0,array1,0,array.length);
        System.out.println("array 1 is "+ Arrays.toString(array2));

        System.arraycopy(array,2,array2,0,4);
        System.out.println("array 2 is - "+Arrays.toString(array2));*/

        int[][] source = {{2,4,6,8,10},{1,3,5,7,9},{55}};
        int [][] destination = new int[source.length][];
        /*for (int i=0;i<destination.length;i++){
            destination[i]=new int [source[i].length];
            for (int j=0;j<destination[i].length;j++){
                destination[i][j] = source[i][j];
            }
        }
        System.out.println(Arrays.deepToString(destination));*/

        /*for (int i=0;i<destination.length;i++){
            destination[i] = new int[source[i].length];
            System.arraycopy(source[i],0,destination[i],0,destination[i].length);
        }
        System.out.println(Arrays.deepToString(destination));*/

        int[][] test={{2,4,6,8},{1,3,5,7},{9}};
        int [][] testCopy=new int[test.length][];

        for (int i=0;i<testCopy.length;i++){
            testCopy[i]=new int[test[i].length];
            System.arraycopy(test[i],0,testCopy[i],0,testCopy[i].length);
        }
        System.out.println(Arrays.deepToString(testCopy));

    }
}
