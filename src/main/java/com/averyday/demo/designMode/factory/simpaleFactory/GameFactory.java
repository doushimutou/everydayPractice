package com.averyday.demo.designMode.factory.simpaleFactory;

/**
 * Description
 * 简单工厂模式：
 * 将产品的类型放在工厂类里面去创建。工厂类负责创建不同种类的游戏实例。具体实例中的的动作，有类自己决定
 * Author ayt  on
 */
public class GameFactory {
    public static Gameable creator(String gameType) {
        Gameable gameable;
        switch (gameType) {
            case "shoot":
                gameable = new ShootGame();
                return gameable;
            case "tower":
                gameable = new TowerDefenceGame();
                return gameable;
            default:
                return null;
        }

    }
}
