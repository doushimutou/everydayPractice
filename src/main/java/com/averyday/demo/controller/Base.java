package com.averyday.demo.controller;

import com.averyday.demo.base.readProperties.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Semaphore;

/**
 * Description
 * Author ayt  on
 */
@RestController
@RequestMapping(value = "base")
@PropertySource("classpath:test.properties")
public class Base {
	private final Semaphore permit = new Semaphore(2, true);

	@Value("${userName.test}")
	String userName;
	@Autowired
	StudentDto studentDto;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String base() {
		String userName1 = null;
		try {
			permit.acquire();
			System.out.println(studentDto.getAddress());
			userName1 = userName;
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			permit.release();
		}
		return userName1;
	}
}
