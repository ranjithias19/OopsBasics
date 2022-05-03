package com.java.polymorphism.compiletimepoly;

public class OperatorOverload {

    public void add(String str1,String str2) {
        System.out.println("add two strings:: "+(str1+str2));
    }

    public void add(int var1, int var2) {
        System.out.println("add two integers:: " + (var1+var2));
    }

    public static void main(String[] args) {
        OperatorOverload obj = new OperatorOverload();
        obj.add(5,7);
        obj.add("Hello","Ranjith");

    }
}
