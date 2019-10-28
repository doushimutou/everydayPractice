package com.averyday.demo.thread.TestThreadLocal;

import java.text.SimpleDateFormat;
import java.util.Random;


/**
 * Description   每个线程的变量是不共享的。利用ThreadLocal可以在线程内存储变量
 * Author ayt  on
 */
public class ThreadLocalExample implements Runnable {

	private static final ThreadLocal<SimpleDateFormat> FORMAT_THREAD_LOCAL= ThreadLocal.withInitial(()->new SimpleDateFormat("yyyyMMdd HHmm"));
	public static void main(String[] args) throws InterruptedException {
		ThreadLocalExample threadLocalExample = new ThreadLocalExample();
		for (int i = 0; i <10 ; i++) {
			Thread thread = new Thread(threadLocalExample,""+i);
			Thread.sleep(new Random().nextInt(1000));
			thread.start();
		}
	}
	@Override
	public void run() {
		System.out.println("Thread Name = "+Thread.currentThread().getName() + "default format =" + FORMAT_THREAD_LOCAL.get().toPattern());

		try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		FORMAT_THREAD_LOCAL.set(new SimpleDateFormat());
		System.out.println("Thread Name = "+ Thread.currentThread().getName() + "formatter =" + FORMAT_THREAD_LOCAL.get().toPattern());

	}
}
