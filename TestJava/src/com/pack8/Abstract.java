package com.pack8;

abstract public class Abstract {
    static String getHello(){
        return "abstract string impl";
    }
    final String get(){
        return "Hi";
    }

    abstract  String getWord();
}
