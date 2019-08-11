package com.averyday.demo.designMode.builder.improve;

/**
 * @Author: ayt
 * @Date: 2019/8/10 00:29
 * @Description: Don't worry ,just try
 */
public class HouseDiretor {
    HouseBuilder houseBuilder = null;

    public HouseDiretor(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.getHouse();
    }
}
