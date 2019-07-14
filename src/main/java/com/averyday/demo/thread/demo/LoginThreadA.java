package com.averyday.demo.thread.demo;

/**
 * Description
 * Author ayt  on
 */
public class LoginThreadA extends Thread {

    @Override
    public void run() {
        Login.doPost("admin","admin");
    }
}
