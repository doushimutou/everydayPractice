package com.averyday.demo.thread;

/**
 * Description
 * Author ayt  on
 * 线程调用具有随机性
 */
public class TestThread extends Thread {
    public static void main(String[] args) {
        TestThread testThread = new TestThread();
        testThread.start();
        System.out.println("主线程");
    }

    @Override
    public void run() {
        //业务代码
        super.run();
        System.out.println("这个自己控制的线程");
    }
}
