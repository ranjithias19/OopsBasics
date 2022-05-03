package com.pack8;


public class ActualClass extends Abstract {
    static int intVariable=5;
    static final double doubleVariable=5.55;
    @Override
    public String getWord() {
        return "word impl by Actual class";
    }

    public static void main(String[] args){
     ActualClass a=new ActualClass();
     System.out.println(a.getWord());
       // System.out.println(a.getHello());

        System.out.println(ActualClass.getHello());
        System.out.println(a.get());
        System.out.println(ActualClass.intVariable);// a.var both works

       // System.out.println(a.doubleVariable);
       System.out.println(ActualClass.doubleVariable);

    }
}
