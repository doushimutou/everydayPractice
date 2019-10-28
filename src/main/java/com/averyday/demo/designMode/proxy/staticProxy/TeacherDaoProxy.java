package com.averyday.demo.designMode.proxy.staticProxy;

/**
 * Description
 * Author ayt  on
 */
public class TeacherDaoProxy implements Teacher {

	private TeacherDao teacherDao;

	public TeacherDaoProxy(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	@Override
	public void teach() {
		System.out.println("代理老师准备干活");
		teacherDao.teach();
	}
}
