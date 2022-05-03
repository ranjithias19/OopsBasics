package com.java.accessSpecifiers.OutsidePackage;

import com.java.accessSpecifiers.ClassAndPackage.AccessDemo1;

public class AccessDemo4 {
    public static void main(String args[]){
        AccessDemo1 obj=new AccessDemo1();
        System.out.println("OUSIDE PACKAGE");
        System.out.println(obj.publicVariable);
       // System.out.println(obj.protVariable);// prot cant have access outside package
       // System.out.println(obj.defaultVariable); default also cant have access outside package
        //System.out.println(obj.privateVariable); same
    }
}
