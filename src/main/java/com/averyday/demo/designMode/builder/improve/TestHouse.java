package com.averyday.demo.designMode.builder.improve;

/**
 * @Author: ayt
 * @Date: 2019/8/10 00:33
 * @Description: Don't worry ,just try
 */
public class TestHouse {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        HouseDiretor houseDiretor = new HouseDiretor(commonHouse);
        House house = houseDiretor.constructHouse();




    }
}
