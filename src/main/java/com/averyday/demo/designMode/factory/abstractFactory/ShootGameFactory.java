package com.averyday.demo.designMode.factory.abstractFactory;

import com.averyday.demo.designMode.factory.abstractFactory.game.DoubleShootGame;
import com.averyday.demo.designMode.factory.abstractFactory.game.ShootGame;
import com.averyday.demo.designMode.factory.abstractFactory.game.SingleShootGame;

/**
 * Description
 * Author ayt  on
 */
public class ShootGameFactory implements GameFactory {
    @Override
    public Gameable creatSingleGame() {
        return new SingleShootGame();
    }

    @Override
    public Gameable creatDoubleGame() {
        return new DoubleShootGame();
    }
}
