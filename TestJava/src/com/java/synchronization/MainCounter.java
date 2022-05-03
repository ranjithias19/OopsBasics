package com.java.synchronization;

class Counter{
    int count;
    synchronized void increment(){
        count++;
    }
}
class MainCounter {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        // Thread 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    c.increment();
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10000; i++) {
                    c.increment();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}