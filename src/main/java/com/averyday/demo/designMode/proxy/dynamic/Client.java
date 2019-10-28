package com.averyday.demo.designMode.proxy.dynamic;

/**
 * Description
 * Author ayt  on
 */
public class Client {
	public static void main(String[] args) {
		TeacherDao teacherDao = new TeacherDao();
		ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
		ITeacher iTeacher = (ITeacher) proxyFactory.getProxyInstance();
		iTeacher.teach();
	}
}
