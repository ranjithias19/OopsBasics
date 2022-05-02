package com.pack9.compiletimepoly;

public class MethodOverloadByTypeofParams {
    public void print(String str) {
        System.out.println("print with str param= " + str);
    }

    public void print(int var) {
        System.out.println("print with int param= " + var);
    }

    public static void main(String args[]) {
        MethodOverloadByTypeofParams obj = new MethodOverloadByTypeofParams();
        obj.print(5);
        obj.print("Hello");

    }
}
