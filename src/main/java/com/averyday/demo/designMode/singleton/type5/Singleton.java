package com.averyday.demo.designMode.singleton.type5;

/**
 * Description
 * //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
 * //同时保证了效率, 推荐使用
 * Author ayt  on
 */
public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {

    }

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
