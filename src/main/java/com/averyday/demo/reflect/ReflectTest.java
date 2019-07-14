package com.averyday.demo.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Description
 * Author ayt  on
 * 反射
 */
public class ReflectTest {
    public static  void main (String[] args){
        Teacher teacher = new Teacher("aaa",7);
        Class< ? extends Teacher>  teacherClass= teacher.getClass();
        //获取所有构造方法
        Constructor[] declaredConstructors = teacherClass.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length ; i++) {
            Constructor constructor = declaredConstructors[i];
            System.out.println("是否允许带有可变数量的参数"+ constructor.isVarArgs());
            Class[] parameterTypes = constructor.getParameterTypes();  //所有的参数类型
            //遍历输出
            for (int j = 0; j <parameterTypes.length ; j++) {
            Class c =    parameterTypes[j];
                System.out.println("参数类型为："+c);
            }
            Teacher teacher1 = null;
            if(i==2){
                try {
                    teacher1 = (Teacher) constructor.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

            }else if (i ==1){
                try {
                    teacher1= (Teacher) constructor.newInstance("ssss",2);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
