package com.java.accessSpecifiers.ClassAndPackage;

public class AccessDemo1 {
    public int publicVariable=2;
    protected int protectedVariable=3;

    int defaultVariable=4;

    private int privateVariable=5;

    public static void main(String args[]){
        AccessDemo1 obj=new AccessDemo1();
        System.out.println("WITHIN CLASS ");
        System.out.println(obj.publicVariable);
        System.out.println(obj.protectedVariable);
        System.out.println(obj.defaultVariable);
        System.out.println(obj.privateVariable);

    }
}
