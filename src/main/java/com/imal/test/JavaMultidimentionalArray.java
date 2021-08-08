package com.imal.test;

public class JavaMultidimentionalArray {
    public static void main(String[] args) {
        int[][] ages = {{2,5,12,8},{5,6,2,12,56},{7}};

        /*System.out.println("first array size - "+ages[0].length);
        System.out.println("first array size - "+ages[1].length);
        System.out.println("first array size - "+ages[2].length);*/

        /*for (int i=0;i<ages.length;i++){
            for (int j=0;j<ages[i].length;j++){
                System.out.println(i +" array elements - "+ ages[i][j]);
            }
        }*/

        /*for (int[] array : ages){
            for (int data : array){
                System.out.println(data);
            }
        }*/

        // create a 3d array
        int[][][] test = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };

        for (int[][] array1 : test){
            for (int [] arrayinner : array1){
                for (int data : arrayinner){
                    System.out.println(data);
                }
            }
        }
    }
}
