package org.example.shyamdannuri;

public class Thread2 implements Runnable{
    private Thread dependency;

    public Thread2(){

    }
    public Thread2(Thread t){
        this.dependency = t;
    }
    public void run() {
        if(dependency != null){
            try {
                dependency.join();
            } catch (InterruptedException e) {
                System.out.println("Thread 2 is interrupted");
            }
        }
        for(int i = 10; i < 20; i++){
            System.out.print("*" + i + "*");
        }
    }
}
