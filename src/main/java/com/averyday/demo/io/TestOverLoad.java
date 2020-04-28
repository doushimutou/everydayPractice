package com.averyday.demo.io;

/**
 * Description
 * Author ayt  on
 */
public class TestOverLoad {
	private String name;
	private Integer age;
	public TestOverLoad() {
	}

	public TestOverLoad(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	public String TestOverLoad(String name, Integer age) {
		this.name = name;
		this.age = age;
		return "aaa";
	}


}
