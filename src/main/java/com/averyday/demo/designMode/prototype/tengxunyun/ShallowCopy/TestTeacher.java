package com.averyday.demo.designMode.prototype.tengxunyun.ShallowCopy;

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
