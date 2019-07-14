package com.averyday.demo.reflect;

/**
 * Description
 * Author ayt  on
 */
public class Teacher1 {
    static void staticMethod() {
        System.out.println("执行staticMethod方法");
    }

    public int publicMethod(int i) {
        System.out.println("执行publicMethod方法");
        return i * 100;
    }

    protected int protectedMethod(String s, int i) {
        System.out.println("执行protectedMethod方法");
        return Integer.valueOf(s) + i;
    }

    private String privateMethod(String... strings) {
        System.out.println("执行privateMethod方法");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            stringBuffer.append(strings[i]);
        }
        return stringBuffer.toString();
    }

}
