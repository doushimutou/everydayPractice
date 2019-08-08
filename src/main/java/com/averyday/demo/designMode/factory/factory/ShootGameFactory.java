package com.averyday.demo.designMode.factory.factory;

/**
 * Description
 * Author ayt  on
 */
public class ShootGameFactory implements GameFactory {

    @Override
    public Gameable creatFactory() {
        Gameable gameable;
        gameable = new ShootGame();
        return gameable;
    }
}
