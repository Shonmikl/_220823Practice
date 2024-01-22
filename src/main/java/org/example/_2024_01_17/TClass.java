package org.example._2024_01_17;

public class TClass extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("COUNTER: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        TClass tClass = new TClass();
        tClass.start();

        Thread.sleep(2500);
        System.out.println("After sleeping.... ... ...");

        tClass.b = false;
        tClass.join();

        System.out.println("END");
    }
}