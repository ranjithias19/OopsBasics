package com.pack1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Raj {
    public static void main(String args[]) {
        try {
            App a = new App();
            Class obj = a.getClass();
            Field f = obj.getDeclaredField("var");
            f.setAccessible(true);
            f.set(a, 2);
            Integer value = (Integer) f.get(a);
            System.out.println(value);


            int modifier = f.getModifiers();
            System.out.println("Access Modifier: " + Modifier.toString(modifier));


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}