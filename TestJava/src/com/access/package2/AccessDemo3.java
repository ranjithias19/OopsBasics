package com.access.package2;


import com.access.package1.AccessDemo1;

public class AccessDemo3 extends AccessDemo1 {
    public static void main(String args[]){
        AccessDemo3 obj=new AccessDemo3();
        System.out.println("OUSIDE PACKAGE by subclass");
        System.out.println(obj.publicVariable);
        System.out.println(obj.protectedVariable);
       // System.out.println(obj.defaultVariable); default even dont have access outside pack by subclass
       // System.out.println(obj.privateVariable); same
    }
}
