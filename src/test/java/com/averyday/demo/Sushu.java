package com.averyday.demo;

import org.junit.Test;

/**
 * Description
 * Author ayt  on 20190603
 */
public class Sushu {
    @Test
    public void test() {
//        int x ;
//        for (int i = 101; i <200; i++) {
//            if(i % 2 == 1){
//               Math.sqrt(i)>=2
//            }
//
//        }
        int count = 0;
        for (int i = 101; i < 200; i += 2) {
            boolean b = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            if (b == true) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("素数个数是: " + count);
    }


}
