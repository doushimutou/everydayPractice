package com.averyday.demo.designMode.factory.abstractFactory;

/**
 * Created by ayt on ${DTAE}
 * <p>
 * 1、GameFactory：抽象工厂，规定了生成单人和双人两种游戏
 * 2、ShootGameFactory，ShootGameFactory：具体工厂，负责生产具体的射击类和塔防类单，双人游戏
 * 3、 Gameable是抽象产品，ShootGame和TowerDefenceGame是抽象类，继承Gameable
 * 4、SingleShootGame，DoubleShootGame，SingleTowerDefenceGame，DoubleTowerDefenceGame是具体产品
 * just try
 */
public interface Gameable {
    void validateAccount(String nickName);

    void getPlayerNum();
}
