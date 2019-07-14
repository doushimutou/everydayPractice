package com.averyday.demo.thread.demo;

/**
 * Description
 * Author ayt  on
 */
public class Login {
    private static String name;
    private static String password;

    public synchronized static void doPost(String names, String passwords) {
        name = names;
        try {
            if (name.equals("admin")) {
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        password = passwords;
        System.out.println("name=" + name + "   password =" + password);

    }
}
