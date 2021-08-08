package com.imal.test;

public class JavaInnerClass {
    String name;

    class InnerOne{
        public void printInnerOne(){
            System.out.println("inner one");
        }
    }

    class InnerTwo{
        public void printInnerTwo(){
            System.out.println("inner two");
        }
    }

    public static void main(String[] args) {
        JavaInnerClass javaInnerClass = new JavaInnerClass();
        JavaInnerClass.InnerOne innerOne = javaInnerClass.new InnerOne();
        innerOne.printInnerOne();

        JavaInnerClass.InnerTwo innerTwo = javaInnerClass.new InnerTwo();
        innerTwo.printInnerTwo();
    }
}
