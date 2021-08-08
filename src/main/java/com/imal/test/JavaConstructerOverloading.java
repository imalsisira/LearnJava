package com.imal.test;

public class JavaConstructerOverloading {
    private String name;
    private int age;

    JavaConstructerOverloading(){
        this.name = "imal";
        this.age = 28;
    }

    JavaConstructerOverloading(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        JavaConstructerOverloading j = new JavaConstructerOverloading();
        JavaConstructerOverloading jj = new JavaConstructerOverloading("hiru",24);
        System.out.println(j.name + " age is "+ j.age);
        System.out.println(jj.name +" age is "+ jj.age);

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        d.setName("Programiz");
    }
}

class Data {
    // private variable
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
