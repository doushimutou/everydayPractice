package com.averyday.demo.designMode.factory.abstractFactory.game;

import com.averyday.demo.designMode.factory.abstractFactory.game.ShootGame;

/**
 * Description
 * Author ayt  on
 */
public class DoubleShootGame extends ShootGame {


    @Override
    public void getPlayerNum() {
        System.out.println("这个是双人游戏");
    }

    @Override
    protected void play() {
        System.out.println("双人玩");
    }
}
