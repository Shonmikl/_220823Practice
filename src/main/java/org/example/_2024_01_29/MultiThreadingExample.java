package org.example._2024_01_29;

public class MultiThreadingExample {
    private static final Object LOCK = new Object();

    void mobileCall() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("Mobile call start..... ... .. .. .");
            Thread.sleep(1500);
            System.out.println("******Mobile call end******");
        }
    }

    void waCall() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("WA call start..... ... .. .. .");
            Thread.sleep(1500);
            System.out.println("******WA call end******");
        }
    }

    void skypeCall() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("Skype call start..... ... .. .. .");
            Thread.sleep(1500);
            System.out.println("******Skype call end******");
        }
    }

    public static void main(String[] args) {
        Thread WAT = new Thread(new WaC());
        Thread ST = new Thread(new SkypeC());
        Thread MT = new Thread(new MC());

        WAT.start();
        ST.start();
        MT.start();
    }
}

class MC implements Runnable {

    @Override
    public void run() {
        try {
            new MultiThreadingExample().mobileCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class SkypeC implements Runnable {

    @Override
    public void run() {
        try {
            new MultiThreadingExample().skypeCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class WaC implements Runnable {

    @Override
    public void run() {
        try {
            new MultiThreadingExample().waCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}