package com.averyday.demo.designMode.factory.factory;

/**
 * Description
 * 工厂模式跟简单工厂模式的区别在于简单工厂只有一个工厂类，提供了一个工厂方法，由入参决定生产那个产品，而工厂模式则定义一个工厂接口，不同的产品工厂实现工厂接口，生产的产品由产品工厂决定
 将工厂类接口化，不同的产品工厂管理不同的类
 * Author ayt  on
 */
public class Test {
    public static void main(String[] args) {
        GameFactory shootGameFactory = new ShootGameFactory();
        shootGameFactory.creatFactory().validateAccount("测试");
    }
}
