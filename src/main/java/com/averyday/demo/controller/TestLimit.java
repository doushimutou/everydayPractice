package com.averyday.demo.controller;

import com.google.common.util.concurrent.RateLimiter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description
 * Author ayt  on
 */
@RestController
@RequestMapping(value = "test")
public class TestLimit {
	RateLimiter limiter = RateLimiter.create(5.0); // 这里的1表示每秒允许处理的量为1个

	@RequestMapping(value = "/limit",method = RequestMethod.GET)
	@RateLimitAspect
	public void testLimit() {
//		double waitTime = limiter.acquire(); // 请求RateLimiter, 超过permits会被阻塞
//		System.out.println("cutTime=" + System.currentTimeMillis() + " waitTime:" + waitTime);

		System.out.println("请求成功");
	}
}
