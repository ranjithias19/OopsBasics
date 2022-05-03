package com.java.polymorphism.runtimepoly;


class Bike{
    void run(){System.out.println("running");}
}
class SubBike extends Bike{
    void run(){System.out.println("running  with 60km");}

    public static void main(String[] args){
        Bike b = new SubBike();//upcasting //subclass method
        b.run();
        SubBike s=new SubBike(); //subclass method
        s.run();
        Bike obj=new Bike(); //parent class method
        obj.run();
    }
}