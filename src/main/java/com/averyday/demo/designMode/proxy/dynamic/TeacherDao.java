package com.averyday.demo.designMode.proxy.dynamic;

/**
 * Description
 * Author ayt  on
 */
public class TeacherDao implements ITeacher {
	@Override
	public void teach() {
		System.out.println("老师教书");
	}
}
