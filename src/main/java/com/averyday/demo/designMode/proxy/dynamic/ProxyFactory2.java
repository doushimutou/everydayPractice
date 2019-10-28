package com.averyday.demo.designMode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Description
 * Author ayt  on
 */
public class ProxyFactory2 implements InvocationHandler {

	private TeacherDao teacherDao;

	public Object getNewInstance(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
		return Proxy.newProxyInstance(teacherDao.getClass().getClassLoader(), teacherDao.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return null;
	}
}
