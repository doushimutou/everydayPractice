package com.averyday.demo.thread.executor;

import java.util.concurrent.*;

/**
 * Description
 * Author ayt  on
 */
public class TestCacheThreadPool {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		ExecutorService executorService1 = new ThreadPoolExecutor(10, 50, 0, TimeUnit.MINUTES, new LinkedBlockingDeque<>(), new ThreadPoolExecutor.AbortPolicy());

		for (int i = 0; i < 20; i++) {
			executorService.execute(new TestRunnable());
			System.out.println("************* a" + i + " *************");
		}
		executorService.shutdown();
	}
}

class TestRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "线程被调用了。");
	}
}
