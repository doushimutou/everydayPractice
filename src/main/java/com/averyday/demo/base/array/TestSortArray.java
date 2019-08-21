package com.averyday.demo.base.array;


import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Description
 * Author ayt  on
 */
public class TestSortArray {

    private static Logger logger = LoggerFactory.getLogger(TestSortArray.class);

    public static void main(String[] args) {
        int data[] = {5, 2, 1, 4, 3};
        int[] arraycopy = new int[3];
        System.arraycopy(data,2,arraycopy,0,2);
        System.out.println(JSON.toJSONString(arraycopy));

        //排序
        Arrays.sort(data);
        System.out.println(JSON.toJSONString(data));
        //排序
        for (int x = 0; x < data.length - 1; x++) {
            for (int i = 0; i < data.length - 1 - x; i++) {
                if (data[i] > data[i + 1]) {
                    int temp = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = temp;
                }
            }
        }

        logger.info(JSON.toJSONString(data));
        //转置
        int center = data.length / 2;
        int head = 0;
        int tail = data.length - 1;
        for (int y = 0; y < center; y++) {
            int temp = data[head];
            data[head] = data[tail];
            data[tail] = temp;
            head++;
            tail--;
        }
        logger.info(JSON.toJSONString(data));


    }
}
