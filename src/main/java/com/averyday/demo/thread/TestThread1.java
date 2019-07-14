package com.averyday.demo.thread;

/**
 * Description
 * TestThread1 类中的 start() 方法通知“线程规划器”此线程已经准备就绪，等待调用线程对象的 run() 方法。这个过程其实就是让系统安排一个时间来调用 Thread 中的 run() 方法，也就是使线程得到运行，启动线程，具有异步执行的效果。
 * <p>
 * 如果调用代码 thread.run() 就不是异步执行了，而是同步，那么此线程对象并不交给“线程规划器”来进行处理，而是由 main 主线程来调用 run() 方法，也就是必须等 run() 方法中的代码执行完后才可以执行后面的代码。
 * Author ayt  on
 */
public class TestThread1 extends Thread {

    public static void main(String[] args) {
        TestThread1 testThread1 = new TestThread1();
        testThread1.setName("myThread");
        testThread1.start();
//        testThread1.run();
        for (int i = 0; i < 10; i++) {
            int time = (int) (Math.random() * 1000);
            try {
                Thread.sleep(time);
                System.out.println("主线程名称是：" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int time = (int) (Math.random() * 1000);
            try {
                Thread.sleep(time);
                System.out.println("当前线程名是：" + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
