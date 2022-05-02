package com.pack7;

public class ActualClass implements A,B{

    @Override
    public void test() {
        System.out.println("testing multiple inheritance through interfaces");
    }
    public static void main(String args[]){
        ActualClass a=new ActualClass();
        a.test();
    }
}
