package com.pack9.runtimepoly;


class Bike{
    void run(){System.out.println("running");}
}
class SubBike extends Bike{
    void run(){System.out.println("running  with 60km");}

    public static void main(String[] args){
        Bike b = new SubBike();//upcasting
        b.run();
        SubBike s=new SubBike();
        s.run();
    }
}