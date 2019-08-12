package com.averyday.demo.designMode.prototype.tengxunyun.deepCopy;

import lombok.Data;

import java.util.ArrayList;

/**
 * Description
 * Author ayt  on
 */
@Data
public class Teacher implements Cloneable {
    private String name;
    private String address;
    private Integer age;
    ArrayList<String> courses;

    @Override
    protected Teacher clone() {
        Teacher teacher = null;
        try {
            teacher = (Teacher) super.clone();
            //  深拷贝：当一个类的拷贝构造方法，不仅要复制对象的所有非引用成员变量值，还要为引用类型的成员变量创建新的实例，并且初始化为形式参数实例值。
            teacher.courses = (ArrayList<String>) this.courses.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return teacher;

    }


}
