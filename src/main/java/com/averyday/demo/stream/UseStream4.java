package com.averyday.demo.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * Description  toarray、allmatch、anymatch、nonematch
 * Author ayt  on
 */
public class UseStream4 {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("a", "b", "c");
        //将list转为数组
        String[] a = strs.stream().toArray(str -> new String[strs.size()]);
        String[] a1 = strs.stream().toArray(String[]::new);
        String[] b = strs.toArray(new String[strs.size()]);
        //所有都匹配才是true
        boolean q = strs.stream().allMatch(s -> s.equals("a"));
        //任意一个匹配就是true
        boolean w = strs.stream().anyMatch(s -> s.equals("a"));
        //没有一个匹配就是true
        boolean e = strs.stream().noneMatch(s -> s.equals("a"));


        //返回第一个对象
        strs.stream().filter(s -> !s.equals("a")).findFirst();
        //返回任意一个、并行接口
        strs.parallelStream().filter(s -> !s.equals("a")).findAny();

        Optional<String> max = strs.stream().max((o1, o2) -> o1.compareTo(o2));
        Optional<String> min = strs.stream().min(Comparator.comparing(Function.identity()));


    }
}
