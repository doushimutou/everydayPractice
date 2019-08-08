package com.averyday.demo.designMode.factory.factory;

/**
 * Description
 * Author ayt  on
 */
public class TowerDefenceGame implements Gameable {
    @Override
    public void validateAccount(String nickName) {
        System.out.println("塔类游戏" + nickName);
    }
}
