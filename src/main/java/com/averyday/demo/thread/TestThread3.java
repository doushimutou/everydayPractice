package com.averyday.demo.thread;

/**
 * Description
 * 线程间的变量不共享
 * Author ayt  on
 */
public class TestThread3 extends Thread {
    private int count = 5;


    public TestThread3(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println(Thread.currentThread().getName()+ "算的值为："+ count);
        }
    }

    public static void main(String[] args) {
        TestThread3 testThread = new TestThread3("a");
        TestThread3 testThread1 = new TestThread3("b");
        TestThread3 testThread2 = new TestThread3("c");
        testThread.start();
        testThread1.start();
        testThread2.start();

    }
}
