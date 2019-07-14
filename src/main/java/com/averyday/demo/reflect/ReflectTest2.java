package com.averyday.demo.reflect;

import java.lang.reflect.Field;

/**
 * Description
 * Author ayt  on
 * 通过反射获取成员变量
 */
public class ReflectTest2 {
    public static void main(String[] args) throws IllegalAccessException {
        Teacher teacher = new Teacher();
        Class taacherClasses = teacher.getClass();
        //获取所有成员变量
        Field[] declaredField = taacherClasses.getDeclaredFields();
        for (int i = 0; i < declaredField.length; i++) {
            Field field = declaredField[i];
            System.out.println("成员变量的名称为：" + field.getName());
            System.out.println("成员变量的类型为：" + field.getType());

            Boolean isBack = true;
            while (isBack) {
                try {
                    isBack = false;
                    System.out.println("成员变量修改前值为：" + field.get(teacher));
                    if (field.getType().equals(int.class)) {
                        field.setInt(teacher, 5);
                    } else {
                        field.set(teacher, "wwwefefe");
                    }
                    System.out.println("修改后值为：" + field.get(teacher));
                } catch (Exception e) {
                    field.setAccessible(true);
                    isBack = true;
                }

            }


        }

    }
}
