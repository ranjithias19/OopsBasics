package com.java.multipleInheritWithInterfaces;

public class ActualClass implements InterfaceA, InterfaceB {

    @Override
    public void test() {
        System.out.println("testing multiple inheritance through interfaces");
    }
    public static void main(String[] args){
        ActualClass a=new ActualClass();
        a.test();
    }
}
