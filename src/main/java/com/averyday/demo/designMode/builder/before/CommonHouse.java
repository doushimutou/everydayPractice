package com.averyday.demo.designMode.builder.before;

/**
 * @Author: ayt
 * @Date: 2019/8/10 00:22
 * @Description: Don't worry ,just try
 */
public class CommonHouse extends AbstractHouse {
    @Override
    public void buildBasic() {
        System.out.println("11111111111");
    }

    @Override
    public void buildWall() {
        System.out.println("22222222222");
    }

    @Override
    public void roofed() {
        System.out.println("33333333333");
    }
}
