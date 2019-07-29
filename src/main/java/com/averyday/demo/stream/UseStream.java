package com.averyday.demo.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Description  中间操作方法
 * Author ayt  on
 */
public class UseStream {
    public static void main(String[] args) {
        String[] dd = {"a", "b", "c"};
        System.out.println();
        //filter
        Arrays.stream(dd).filter(s -> s.equals("a")).forEach(System.out::println);
        //map
        Integer[] cc = {1, 2, 3};
        Arrays.stream(cc).map(s -> Integer.toString(s)).forEach(s -> {
            System.out.println(s);
            System.out.println(s.getClass());
        });
        //flatmap   map返回的是stream的泛型  s.split("")返回的是string[] 而不是string ,Stream(String[])通过Arrays.stream()合成新的数据流,flatmap将返回新的数据流
        Arrays.stream(dd).map(s -> s.split("")).flatMap(s -> Arrays.stream(s)).forEach(System.out::println);
        System.out.println("--------------");
    }

}
