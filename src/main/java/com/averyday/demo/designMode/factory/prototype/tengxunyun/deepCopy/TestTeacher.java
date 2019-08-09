package com.averyday.demo.designMode.factory.prototype.tengxunyun.deepCopy;

import java.util.ArrayList;

/**
 * Description
 * Author ayt  on
 */
public class TestTeacher {
    public static void main(String[] args) {
        Teacher a = new Teacher();
        a.setAddress("测试地址");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("音乐");
        arrayList.add("美术");
        a.setCourses(arrayList);

        Teacher b = a.clone();
        b.getCourses().add("数学");
        System.out.println(a);
        System.out.println(b);
    }
}
