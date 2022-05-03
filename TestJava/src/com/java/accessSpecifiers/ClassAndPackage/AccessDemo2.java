package com.java.accessSpecifiers.ClassAndPackage;

public class AccessDemo2 {
    public static void main(String args[]) {
        AccessDemo1 obj=new AccessDemo1();
        System.out.println("Inside the same package outside the class");
        System.out.println(obj.publicVariable);
        System.out.println(obj.protectedVariable);
        System.out.println(obj.defaultVariable);
        //System.out.println(obj.privateVariable); cant have access even within the pack by outside class

    }
}
