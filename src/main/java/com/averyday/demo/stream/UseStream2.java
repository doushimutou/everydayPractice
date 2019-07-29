package com.averyday.demo.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Description  中间操作sort 、filter、peek、skip
 * Author ayt  on
 */
public class UseStream2 {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp("大熊1", 10, 100.0));
        list.add(new Emp("大熊2", 20, 200.0));
        list.add(new Emp("大熊3", 20, 300.0));
        list.add(new Emp("大熊4", 40, 400.0));
        list.add(new Emp("大熊5", 50, 500.0));
        //对流先去重在排序(降序)
        list.stream().map(emp -> emp.getAge()).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        // 根据emp的属性name，进行排序
        println(list.stream().sorted(Comparator.comparing(Emp::getName)));
        System.out.println("--------------------");
        // 给年纪大于30岁的人，薪水提升1.5倍，并输出结果
        println(list.stream().filter((emp) -> emp.getAge() > 30)
                .peek(emp ->
                        emp.setSalary(emp.getSalary() * 1.5)
                ));
        // 数字从1开始迭代（无限流），下一个数字，是上个数字+1，忽略前5个 ，并且只取10个数字
        // 原本1-无限，忽略前5个，就是1-5数字，不要，从6开始，截取10个，就是6-15
        Stream.iterate(1, x -> ++x).skip(5).limit(10).forEach(System.out::println);

    }

    public static void println(Stream<Emp> stream) {
        stream.forEach(emp -> System.out.println(String.format("名字：%s，年纪：%s，薪水：%s", emp.name, emp.getAge(), emp.getSalary())));
    }


    public static class Emp {
        private String name;
        private Integer age;
        private Double salary;

        public Emp(String name, Integer age, Double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
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

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }
    }
}
