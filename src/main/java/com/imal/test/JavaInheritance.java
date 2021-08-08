package com.imal.test;

class AnimalTest{
    public void sound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dogs extends AnimalTest{
    @Override
    public void sound(){
        super.sound();
        System.out.println("My Sound Is bark");
    }
    public void bark(){
        System.out.println("dog barks");
    }
}
public class JavaInheritance {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.bark();
        d.sound();
    }
}
