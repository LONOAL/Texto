package org.example;

public class Tiempo extends Thread{
    public void run (int milis) {
            try {
                Thread.sleep(milis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println(Main.i);
        }
}
