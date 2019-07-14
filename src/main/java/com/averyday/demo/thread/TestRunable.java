package com.averyday.demo.thread;

/**
 * Description
 * 要启动一个新的线程，不是直接调用 Thread  子类对象的 run() 方法，而是调用 Thread 子类的 start() 方法。Thread 类的 start() 方法会产生一个新的线程，该线程用于执行 Thread 子类的 run() 方法。
 * Author ayt  on
 */
public class TestRunable implements Runnable {
    /**
     * 创建一个 Runnable 对象。
     * 使用参数带 Runnable 对象的构造方法创建 Thread 实例。
     * 调用 start() 方法启动线程。
     * @param args
     */
    public static void main(String[] args) {
        TestRunable testRunable = new TestRunable();
        Thread thread = new Thread(testRunable, "mytest");
        thread.start();
        System.out.println("主线程结束" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("TestRunable运行中" + Thread.currentThread().getName());
    }
}
