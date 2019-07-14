package com.averyday.demo;

import org.junit.Test;

/**
 * Description
 * Author ayt  on 20190530
 */
public class NumToUpper {
    Integer num =  2315;
    private static final String[] CN_UPPER_NUMBER = { "零", "壹", "贰", "叁", "肆",
            "伍", "陆", "柒", "捌", "玖" };
    private static final String[] CN_UPPER_MONETRAY_UNIT = {  "元",
            "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟", "兆", "拾",
            "佰", "仟" };
    @Test
    public void test(){
        String s = num.toString();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            Integer num1 = num % 10 ;
            sb.insert( i,CN_UPPER_NUMBER[num1]);
            num = num /10;
        }
        for (int i = 0; i < s.length(); i++) {
            sb.insert(i*2,CN_UPPER_MONETRAY_UNIT[i]);
        }
        sb.reverse();
        System.out.println(sb);


    }
}
