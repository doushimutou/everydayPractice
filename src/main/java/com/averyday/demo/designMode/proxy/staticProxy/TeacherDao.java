package com.averyday.demo.designMode.proxy.staticProxy;

/**
 * Description
 * Author ayt  on
 */
public class TeacherDao implements Teacher{

	@Override
	public void teach() {
		System.out.println("老师教课");
	}
}
