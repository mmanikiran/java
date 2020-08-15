package org.example.shyamdannuri;

public class Thread1 extends Thread {
    @Override
    public void run() {
        for(int i = 1; i < 10; i++){
            System.out.print("-" + i + "-");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
