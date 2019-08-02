package com.averyday.demo.designMode.singleton.type6;

/**
 * Description
 * Author ayt  on
 */
public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {

    }

    /**
     * 内部类的方式创建实例
     */
    private static class SingletonInstance {
        private static final Singleton singleton = new Singleton();
    }

    public static synchronized Singleton getSingleton() {
        return singleton;
    }
}
