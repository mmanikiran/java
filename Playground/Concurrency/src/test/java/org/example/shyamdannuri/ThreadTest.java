package org.example.shyamdannuri;

import org.junit.Test;

public class ThreadTest {

    //Thread2 waits for Thread1 to finish.
    @Test
    public void testJoin() throws InterruptedException{
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2(t1));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
    //Thread2 and Thread1 runs in parallel
    @Test
    public void testConcurrency() throws InterruptedException{
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        System.out.println("Running first thread");
        t1.start();
        System.out.println("Running second thread");
        t2.start();
        t1.join();
    }
}
