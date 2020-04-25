package com.hatef.thread.synchronization;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        AnotherRun anotherRun = new AnotherRun();
        Thread childThread = new Thread(anotherRun);
        childThread.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("m" + i);
            Thread.sleep(1000);
        }

        childThread.join();
        System.out.println("End");
    }
}

class AnotherRun implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("r" + i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                System.out.println("Interrupt");
            }
        }
    }
}
