package com.averyday.demo.serivalizable;

import java.io.*;

/**
 * Description
 * Author ayt  on
 */
public class TestSerivalable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        serializaTeacher();
        Teacher teacher = deserializaTeacher();
        System.out.println(teacher);
    }

    /**
     * 序列化
     *
     * @throws IOException
     */
    private static void serializaTeacher() throws IOException {
        Teacher teacher = new Teacher();
        teacher.setCar("保时捷");
        teacher.setColor("红色");

        FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\learn\\everydayPractice\\src\\main\\java\\com\\averyday\\demo\\serivalizable\\teacher.txt"));
        ObjectOutputStream obj = new ObjectOutputStream(fileOutputStream);
        obj.writeObject(teacher);
        obj.close();
    }

    /**
     * 反序列化
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static Teacher deserializaTeacher() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(new File("D:\\learn\\everydayPractice\\src\\main\\java\\com\\averyday\\demo\\serivalizable\\teacher.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return (Teacher) objectInputStream.readObject();

    }
}
