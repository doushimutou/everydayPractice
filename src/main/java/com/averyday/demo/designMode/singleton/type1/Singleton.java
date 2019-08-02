package com.averyday.demo.designMode.singleton.type1;

/**              单例模式   避免new 实例 ，而是通过方法获得实例
 * Description   饿汉式 ： 1、私有的构造方法
 *                         2、私有静态变量new 实例
 *                         3、提供公共的静态方法返回实例
 * Author ayt  on
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
