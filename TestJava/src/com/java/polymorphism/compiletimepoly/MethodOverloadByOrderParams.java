package com.java.polymorphism.compiletimepoly;

public class MethodOverloadByOrderParams {
    public void show(int var, String str) {
        System.out.println("print with int,str param= " + var + " " + str);
    }

    public void show(String str, int var) {
        System.out.println("print with str,int param= " + str + " " + var);
    }

    public static void main(String[] args) {
        MethodOverloadByOrderParams obj = new MethodOverloadByOrderParams();
        obj.show(5, "ranjith");
        obj.show("Hello", 7);
    }
}
