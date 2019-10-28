package com.averyday.demo.thread.countTest;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Description
 * Author ayt  on
 */
public class CountExample {
	public static Integer clientTotal = 5000;
	public static Integer Threadtotal = 200;
	public static AtomicInteger count = new AtomicInteger(0);

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newCachedThreadPool();
		final Semaphore semaphore = new Semaphore(Threadtotal);
		final CountDownLatch countDownLatch = new CountDownLatch(clientTotal);
		for (int i = 0; i < clientTotal; i++) {
			executorService.execute(() -> {
				try {
					semaphore.acquire();
					add();
					semaphore.release();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				countDownLatch.countDown();
			});
		}
		countDownLatch.await();
		System.out.println(count.get());

	}

	private static void add() {
//		count++;
		count.getAndIncrement();
	}

}
