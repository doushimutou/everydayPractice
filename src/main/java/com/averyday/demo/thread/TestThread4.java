package com.averyday.demo.thread;

/**
 * Description
 * Author ayt  on
 */
public class TestThread4 extends Thread {
    private int count = 5;

    public static void main(String[] args) {
        TestThread4 testThread4 = new TestThread4();
        Thread a = new Thread(testThread4, "a");
        Thread b = new Thread(testThread4, "b");
        Thread c = new Thread(testThread4, "c");
        Thread d = new Thread(testThread4, "d");
        Thread e = new Thread(testThread4, "e");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }

    /**
     * synchronized
     * 不添加synchronized ，线程不安全，导致数据被同时操作。
     * 添加synchronized  ，线程安全：
     *  多个线程在执行run()方法前，以排队的方式处理。当一个线程调用run()之前，先判断run()有没有上锁，有锁，就等其他线程调用结束后才可以执行run().
     */
    @Override
    public  void run() {
        super.run();
        count--;
        System.out.println(Thread.currentThread().getName() + "计算结果为：" + count);
    }
}
