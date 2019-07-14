package com.averyday.demo;

/**
 * Description
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * Author ayt  on 20190605
 */
public class Condition {
    public void test() {
        int x;
        char grade;
        x = 65;
        grade = x >= 90 ? 'A'
                : x >= 60 ? 'B'
                :'C';
        System.out.println("等级为："+grade);
    }
}
