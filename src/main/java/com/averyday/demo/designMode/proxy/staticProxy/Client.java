package com.averyday.demo.designMode.proxy.staticProxy;

/**
 * Description
 * Author ayt  on
 */
public class Client {
	public static void main(String[] args) {
		TeacherDao teacherDao = new TeacherDao();
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		teacherDaoProxy.teach();
	}
}
