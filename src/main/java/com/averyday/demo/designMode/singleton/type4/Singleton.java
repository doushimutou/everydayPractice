package com.averyday.demo.designMode.singleton.type4;

/**
 * Description
 * 懒汉式：
 * 1、私有构造方法
 * 2、创建成员变量
 * 3、通过公有静态方法获取实例对象，实例创建在方法中
 * 缺点：在方法上添加synchronized同步代码块，影响效率
 * Author ayt  on
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {

    }

    public static synchronized Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
