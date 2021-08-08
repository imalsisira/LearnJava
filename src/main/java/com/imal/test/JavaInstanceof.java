package com.imal.test;

// superclass
class Animal {
}

// subclass
class Dog extends Animal {
}


public class JavaInstanceof {
    public static void main(String[] args) {

        // create an object of the subclass
        Dog d1 = new Dog();

        // checks if d1 is an instance of the subclass
        System.out.println(d1 instanceof Dog);        // prints true

        // checks if d1 is an instance of the superclass
        System.out.println(d1 instanceof Animal);     // prints true
    }
}
