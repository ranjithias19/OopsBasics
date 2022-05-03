package com.java.abstractInheritance;

abstract class Abs {
    abstract void hello();
}

public class Child extends Abs{
    void hello(){
    System.out.println("Hello");
    }
}
