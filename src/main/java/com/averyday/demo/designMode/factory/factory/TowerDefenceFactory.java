package com.averyday.demo.designMode.factory.factory;

/**
 * Description
 * Author ayt  on
 */
public class TowerDefenceFactory implements GameFactory {

    @Override
    public Gameable creatFactory() {
        Gameable gameable = new TowerDefenceGame();
        return gameable;
    }
}
