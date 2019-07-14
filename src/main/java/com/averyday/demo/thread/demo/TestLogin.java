package com.averyday.demo.thread.demo;

/**
 * Description
 * Author ayt  on
 */
public class TestLogin {
    public static void main(String[] args) {
        LoginThreadA a = new LoginThreadA();
        a.start();
        LoginThreadB b = new LoginThreadB();
        b.start();
    }
}

