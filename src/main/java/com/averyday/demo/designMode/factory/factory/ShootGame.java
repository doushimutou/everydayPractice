package com.averyday.demo.designMode.factory.factory;

/**
 * Description
 * Author ayt  on
 */
public class ShootGame implements Gameable {
    @Override
    public void validateAccount(String nickName) {
        System.out.println("射击游戏" + nickName);
    }
}
