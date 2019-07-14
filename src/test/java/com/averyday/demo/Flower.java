package com.averyday.demo;

import org.junit.Test;

/**
 * Description
 * 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 * Author ayt  on 0603
 */
public class Flower {
    @Test
    public void test() {
        int x, y, z;
        for (int i = 100; i <= 999; i++) {
            int a = i;
            x = a % 10;
            a = a / 10;
            y = a % 10;
            a = a / 10;
            z = a % 10;
            if (i == Math.pow(x, 3) + Math.pow(y, 3) + Math.pow(z, 3)) {
                System.out.println(i);
            }

        }
    }


}
