package com.averyday.demo.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Description
 * 反射获取method
 * Author ayt  on
 */
public class ReflectTest3 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Teacher1 teacher1 = new Teacher1();
        Class teacher = teacher1.getClass();
        Method[] methods = teacher.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            Method method = methods[i];
            Class[] parameterTypes = method.getParameterTypes();//获取所有参数类型
            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.println("方法：" + method.getName() + "参数类型为:" + parameterTypes[j]);
            }
            boolean isTum = true;
            while (isTum) {
                isTum = false;
                if ("staticMethod".equals(method.getName())) {
                    method.invoke(teacher1);
                }else if ("publicMethod".equals(method.getName())){
                    System.out.println("返回值是："+method.invoke(teacher1,2));
                }
            }
        }
    }
}
