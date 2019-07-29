package com.averyday.demo.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Description
 * Author ayt  on
 */
public class UseStream5 {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp("上海", "小名", 17));
        list.add(new Emp("北京", "小红", 18));
        list.add(new Emp("深圳", "小蓝", 19));
        list.add(new Emp("广州", "小灰", 20));
        list.add(new Emp("杭州", "小黄", 21));
        list.add(new Emp("贵阳", "小白", 22));

        //取出name存list
        list.stream().map(emp -> emp.getName()).collect(Collectors.toList());
        //取出name存set
        list.stream().map(emp -> emp.getName()).collect(Collectors.toSet());
        //转map  function.identity 值得是emp本身
        list.stream().collect(Collectors.toMap(Emp::getName, Function.identity()));
        //计算元素个数
        list.stream().collect(Collectors.counting());
        //数据求和
        list.stream().collect(Collectors.summingInt(Emp::getAge));


    }

    static class Emp {
        private String address;
        private String name;
        private Integer age;

        public Emp(String address, String name, Integer age) {
            this.address = address;
            this.name = name;
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }
}
