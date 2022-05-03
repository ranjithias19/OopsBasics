package com.pack9.compiletimepoly;

public class MethodOverloadByNOofParams {
    public int show(int a){
        return a;
    }

    public int show(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        MethodOverloadByNOofParams obj=new MethodOverloadByNOofParams();
        int firstResult=obj.show(5);
        int secondResult=obj.show(2,5);
        System.out.println("method with one parameter gives = "+firstResult);
        System.out.println("method with two parameters gives multiplication= "+secondResult);

    }
}
