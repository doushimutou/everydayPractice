package com.averyday.demo.designMode.factory.abstractFactory.game;


import com.averyday.demo.designMode.factory.abstractFactory.Gameable;

/**
 * Description
 * Author ayt  on
 */
public abstract class ShootGame implements Gameable {


    protected abstract void play();

    protected void who() {
        System.out.println("我和你");
    }

    @Override
    public void validateAccount(String nickName) {
        who();
        play();
        System.out.println("射击游戏" + nickName);
    }


}
