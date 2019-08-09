package com.averyday.demo.serivalizable;

import java.io.Serializable;

/**
 * Description
 * Author ayt  on
 */
public class Teacher implements Serializable {
//    private static final long serialVersionUID = -7064978170668922872L;
    //静态变量不会被序列化
    private static String name = "刘能1111";
    private String color;
    //transient 修饰的属性，是不会被序列化的
    transient private String car;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Teacher.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "color='" + color + '\'' +
                ", car='" + car + '\'' +
                ", age='" + age + '\'' +
                ", name='" + name +
                '}';
    }
}
