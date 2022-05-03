package com.java.staticDemo;

import com.java.staticDemo.Nam;

public class Method {
    public static void main(String args[]) {
       Nam obj1=new Nam();
        System.out.println(Nam.str);
        obj1.count();

        Nam obj2=new Nam();
        obj2.count();

    }
}
