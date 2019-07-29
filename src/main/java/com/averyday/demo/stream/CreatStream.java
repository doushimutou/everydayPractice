package com.averyday.demo.stream;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description  创建流的集中方式
 * Author ayt  on
 */
public class CreatStream {
    private static Logger logger = LoggerFactory.getLogger(CreatStream.class);

    public static void main(String[] args) {
        String[] dd = {"a", "b", "c"};
        //通过arrays静态方法，传入泛型
        List a = Arrays.stream(dd).filter(s ->
                "a".equals(s)
        ).collect(Collectors.toList());
        logger.info(JSON.toJSONString(a));
        //通过stream静态方法，传入一个泛型数组
        List b = Stream.of(dd).collect(Collectors.toList());
        logger.info(JSON.toJSONString(b));
        //通过Clollection.stream
        //通过stream.iterate 创建,调用一个静态方法
        List c = Stream.iterate(1,x -> x+1).limit(4).collect(Collectors.toList());
        logger.info(JSON.toJSONString(c));


    }
}
