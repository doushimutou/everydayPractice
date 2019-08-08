package com.averyday.demo.designMode.factory.abstractFactory.game;

import com.averyday.demo.designMode.factory.abstractFactory.GameFactory;
import com.averyday.demo.designMode.factory.abstractFactory.ShootGameFactory;

/**
 * Description
 * Author ayt  on
 */
public class Test {
    public static void main(String[] args) {
        ShootGameFactory shootGameFactory = new ShootGameFactory();
        shootGameFactory.creatDoubleGame().validateAccount("shoot");
    }
}
