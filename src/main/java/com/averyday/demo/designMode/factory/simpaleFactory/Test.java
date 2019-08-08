package com.averyday.demo.designMode.factory.simpaleFactory;

/**
 * Description
 * Author ayt  on
 */
public class Test {
    public static void main(String[] args) {
        Gameable shootGame = GameFactory.creator("shoot");
        shootGame.validateAccount("测试");
    }
}
