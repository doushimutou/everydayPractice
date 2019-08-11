package com.averyday.demo.designMode.builder.improve;

/**
 * @Author: ayt
 * @Date: 2019/8/10 00:27
 * @Description: Don't worry ,just try
 */
public  abstract class HouseBuilder {
    House house =new House();
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House getHouse() {
        return house;
    }
}
