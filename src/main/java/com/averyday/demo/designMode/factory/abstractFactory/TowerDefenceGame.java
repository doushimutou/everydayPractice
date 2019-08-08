package com.averyday.demo.designMode.factory.abstractFactory;


/**
 * Description
 * Author ayt  on
 */
public abstract class TowerDefenceGame implements Gameable {
    @Override
    public void validateAccount(String nickName) {
        System.out.println("塔类游戏" + nickName);
    }
}
