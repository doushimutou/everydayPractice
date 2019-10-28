package com.averyday.demo.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Description
 * Author ayt  on
 */
public class TestExecutors {
	public static void main(String[] args) {

//		testFixedThreadPool();
//		testScheduledThreadPool();
		TestCachedThreadPool();
	}

	public static void testFixedThreadPool() {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 20; i++) {
			executorService.execute(() ->
					System.out.println(Thread.currentThread().getName())
			);
		}
	}

	public static void testScheduledThreadPool() {
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
		for (int i = 0; i < 20; i++) {
			scheduledExecutorService.schedule(() -> System.out.println(Thread.currentThread().getName()), 10000, TimeUnit.MICROSECONDS);
		}
	}

	public static void TestCachedThreadPool() {
		ExecutorService executorService = Executors.newCachedThreadPool();
		for (int i = 0; i < 20; i++) {
			executorService.execute(new TestRunable());
			System.out.println("*********a " + i + "*********");
		}
		executorService.shutdown();
	}

	static class TestRunable implements Runnable {
		@Override
		public void run() {
			System.out.println(Thread.currentThread().getName() + "线程调用了");
		}
	}
}
