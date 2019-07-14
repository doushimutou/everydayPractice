package com.averyday.demo.thread.demo;

/**
 * Description
 * Author ayt  on
 */
public class LoginThreadB extends Thread {
    @Override
    public void run() {
        Login.doPost("root", "root");
    }
}
