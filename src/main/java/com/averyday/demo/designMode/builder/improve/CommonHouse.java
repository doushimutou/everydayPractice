package com.averyday.demo.designMode.builder.improve;

/**
 * @Author: ayt
 * @Date: 2019/8/10 00:32
 * @Description: Don't worry ,just try
 */
public class CommonHouse  extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(4444444);
    }

    @Override
    public void buildWalls() {
        System.out.println(555555555);
    }

    @Override
    public void roofed() {
        System.out.println(666666666);
    }
}
