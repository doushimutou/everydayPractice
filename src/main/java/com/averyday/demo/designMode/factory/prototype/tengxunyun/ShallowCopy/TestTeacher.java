package com.averyday.demo.designMode.factory.prototype.tengxunyun.ShallowCopy;

import com.averyday.demo.designMode.factory.prototype.tengxunyun.ShallowCopy.Teacher;

/**
 * Description
 * Author ayt  on
 */
public class TestTeacher {
    public static void main(String[] args) {
        Teacher a = new Teacher();
        a.setAddress("ceshi");
        a.setAge(18);

        Teacher b = a.clone();
        Teacher c = a.clone();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
