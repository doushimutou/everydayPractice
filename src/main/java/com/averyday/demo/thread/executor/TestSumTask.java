package com.averyday.demo.thread.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Description
 * Author ayt  on
 */
public class TestSumTask {
	public static void main(String[] args) {
		ThreadPoolExecutor executorService = new ThreadPoolExecutor(10, 20, 0, TimeUnit.MINUTES, new LinkedBlockingDeque<>(), new ThreadPoolExecutor.AbortPolicy());
		List<Future<Integer>> futureList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			SumTask sumTask = new SumTask(i * 100 + 1, (i + 1) * 100);
			Future<Integer> future = executorService.submit(sumTask);
			futureList.add(future);
		}
		do {
			System.out.println("已经完成了%d 个任务" + executorService.getCompletedTaskCount());
			for (int i = 0; i < futureList.size(); i++) {
				Future<Integer> future = futureList.get(i);
//				System.out.println("task  %d %s",i,future.isDone());
				System.out.printf("Main task %d %s \n", i, future.isDone());
			}
		} while (executorService.getCompletedTaskCount() < futureList.size());

		int total = 0;
		for (int i = 0; i < futureList.size(); i++) {
			Future<Integer> future = futureList.get(i);
			Integer sum = null;
			try {
				sum = future.get();
				total += sum;
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println("结果是："+total);

	}
}
