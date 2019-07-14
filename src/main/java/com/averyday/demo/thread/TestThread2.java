package com.averyday.demo.thread;

/**
 * Description
 * Author ayt  on
 */
public class TestThread2 extends Thread {
    private int i;

    public static void main(String[] args) {
        TestThread2 thread2 = new TestThread2(1);
        TestThread2 thread21 = new TestThread2(2);
        TestThread2 thread22 = new TestThread2(3);
        TestThread2 thread23 = new TestThread2(4);
        TestThread2 thread24 = new TestThread2(5);
        TestThread2 thread25 = new TestThread2(6);
        thread2.start();
        thread21.start();
        thread22.start();
        thread23.start();
        thread24.start();
        thread25.start();

    }

    public TestThread2(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("当前数字是：" + i);
    }
}
