package com.averyday.demo.designMode.builder.before;

/**
 * @Author: ayt
 * @Date: 2019/8/10 00:19
 * @Description: Don't worry ,just try
 */
public abstract class AbstractHouse {

    public abstract void buildBasic();

    public abstract void buildWall();

    public abstract void roofed();

    public void build() {
        buildBasic();
        buildWall();
        roofed();
    }
}
