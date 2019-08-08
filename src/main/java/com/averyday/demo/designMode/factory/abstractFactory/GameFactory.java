package com.averyday.demo.designMode.factory.abstractFactory;

/**
 * Description
 * Author ayt  on
 */
public interface GameFactory {
    Gameable creatSingleGame();

    Gameable creatDoubleGame();
}
