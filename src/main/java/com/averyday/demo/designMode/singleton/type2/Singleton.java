package com.averyday.demo.designMode.singleton.type2;

/**
 * Description
 *单例模式   避免new 实例 ，而是通过方法获得实例
 * 饿汉式 ： 1、私有的构造方法
 *           2、本类内部创建对象实例
 *           3、静态代码块中，创建实例对象
 *           4、提供公共的静态方法返回实例
 * Author ayt  on
 */
public class Singleton {
    private static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    private Singleton() {

    }

    public static Singleton getSingleton() {
        return singleton;
    }

}
