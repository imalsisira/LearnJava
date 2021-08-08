package com.imal.test;

public class JavaConstructer  {
    private String name;

    JavaConstructer(){
        System.out.println("Constructer called");
        name="imal";
    }
    public static void main(String[] args) {
        JavaConstructer javaConstructer = new JavaConstructer();
        System.out.println("The name is " + javaConstructer.name);
    }
}
