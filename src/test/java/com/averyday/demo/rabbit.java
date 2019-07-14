package com.averyday.demo;

import org.junit.Test;

/**
 * Description  斐波那契数列   后面数字等于前面两个相加
 * ：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问   每个月的兔子总数为多少？
 * Author ayt  on 20190531
 */
public class rabbit {

    /**
     * 这个是错误答案，没有认真分析数据特点
     */
    @Test
    public void  bornRabbit(){
        //对数
        int  x = 2 ;
        //月数
        int  y = 7 ;
        for (int i = 1; i < y ; i++) {
            if(i % 3 == 0) {
                x = x * 2 ;
            }
        }
        System.out.println("第"+y + "个月有"+ x +"只兔子");
    }

    @Test
    public  void test2(){
        System.out.println("第1个月的兔子对数:    1");
        System.out.println("第2个月的兔子对数:    1");
        int f1 = 1, f2 = 1, f, M=24;
        for(int i=3; i<=M; i++) {
            f = f2;
            f2 = f1 + f2;
            f1 = f;
            System.out.println("第" + i +"个月的兔子对数: "+f2);
        }
    }

}
