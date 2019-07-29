package com.averyday.demo.thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description
 * Author ayt  on
 */
public class test {
    public static void main(String[] args) {
        int x = 120520000;
        int y = 30400000;
        List spaces = new ArrayList();
        Map spacess = new HashMap();
        for (int i = 1; i < 101; i++) {
            x = x + 10000;
            for (int j = 1; j < 101; j++) {
                List<int[]> coordinates = new ArrayList<>();
                y = y + 15000;
                int[] y3 = {x, y};
                int[] x1 = {x - 10000, y - 15000};
                int[] x2 = {x, y - 15000};
                int[] y1 = {x - 10000, y};
                int[] y2 = {x, y};
                coordinates.add(x1);
                coordinates.add(x2);
                coordinates.add(y1);
                coordinates.add(y2);
                coordinates.add(y3);
                spaces.add(coordinates);
            }
        }
        System.out.println(spaces.size());
    }
}
