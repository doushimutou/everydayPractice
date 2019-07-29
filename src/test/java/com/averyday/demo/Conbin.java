package com.averyday.demo;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * Description
 * Author ayt  on
 */
public class Conbin {
    public static Logger logger = LoggerFactory.getLogger(Conbin.class);

    public static void main(String[] args) {
        int[] a = {1, 0};
        int[] b = {18, -1};
        int[] c = {251, -1};
        System.out.println(combinate(a, b, c));
//        logger.info(JSONObject.toJSONString(combinate(a, b, c)));


        logger.info(JSONObject.toJSONString(combinateFilterInvalid(a, b, c)));
    }

    public static List<int[]> combinate(int[]... args) {
        List<int[]> result = new ArrayList<int[]>();
        Set<String> exists = new HashSet<String>();
        int arrayLength = args.length;
        int runCount = (int) Math.pow(2, arrayLength);
        for (int index = 0; index < runCount; index++) {
            int[] keys = new int[arrayLength];
            String location = String.format("%0" + arrayLength + "d", Integer.valueOf(Integer.toBinaryString(index)));
            int item = 0;
            for (int j = 0; j < arrayLength; j++) {
                int[] tmp = args[j];
                keys[j] = tmp[location.charAt(item) - '0'];
                item += 1;
            }
            String keysString = Arrays.toString(keys);
            if (!exists.contains(keysString)) {// 去重
                exists.add(keysString);
                result.add(keys);
            }
        }
        return result;
    }

    public static List<int[]> combinateFilterInvalid(int[]... args) {
        List<int[]> result = new ArrayList<int[]>();
        List<int[]> comb = combinate(args);
        for (int[] keys : comb) {
            // 排除城市和区域无效组合, 城市为[0], 区域为[2]
            if (keys[0] != 0 || (keys[0] == 0
                    && keys[2] == -1)) {
                result.add(keys);
            }
        }
        return result;
    }


}
