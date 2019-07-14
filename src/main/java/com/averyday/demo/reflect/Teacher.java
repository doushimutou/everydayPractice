package com.averyday.demo.reflect;

/**
 * Description
 * Author ayt  on
 */
public class Teacher {
    private String name;
    protected Integer age;

    public Teacher() {
    }

    public Teacher(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
