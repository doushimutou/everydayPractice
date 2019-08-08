package com.averyday.demo.designMode.factory.abstractFactory.game;

import com.averyday.demo.designMode.factory.abstractFactory.game.ShootGame;

/**
 * Description
 * Author ayt  on
 */
public class SingleShootGame extends ShootGame {

    @Override
    public void getPlayerNum() {
        System.out.println("这个是担任游戏");
    }

    @Override
    protected void play() {

    }
}
