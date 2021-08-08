package com.imal.test;

public class JavaBreak {
    public static void main(String[] args) {
        /*for (int i=0;i<=10;i++){
            if (i==5){
                break;
            }
            System.out.println(i);
        }*/
        first:
        for (int i =1;i<5;i++){
            second:
            for (int j =1;j<4;j++){
                System.out.println("i  =   " + i  + "        and j  =   "+j   );
                if (i==2){
                    break second;
                }
            }
        }
        
    }
}
