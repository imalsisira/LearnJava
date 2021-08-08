package com.imal.test;

public class JavaThisKeyword extends FinalDemo{

    String firstname;

    // setter method
    void setName( String name ) {
        this.firstname = name;
    }

    // getter method
    String getName(){
        return this.firstname;
    }

    public void display() {
        System.out.println("The final method is overridden.");
    }

    public static void main( String[] args ) {
        JavaThisKeyword obj = new JavaThisKeyword();

        // calling the setter and the getter method
        /*obj.setName("Toshiba");
        System.out.println("obj.name: "+obj.getName());*/

        // try to override final method
        obj.display();

    }
}

class FinalDemo {
    // create a final method
    public void display() {
        System.out.println("This is a final method.");
    }
}
