package com.averyday.demo.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Description  foreachOrdered   \ foreach
 * Author ayt  on
 */
public class UserStream3 {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("a", "b", "c");
        strs.stream().forEachOrdered(System.out::print);//abc
        System.out.println();
        strs.stream().forEach(System.out::print);//abc
        System.out.println();
        //使用的parallelStream的流，这个流表示一个并行流，也就是在程序内部迭代的时候，会帮你免费的并行处理
        strs.parallelStream().forEachOrdered(System.out::print);//abc
        System.out.println();
        strs.parallelStream().forEach(System.out::print);//bca


    }
}
