package com.averyday.demo.io;

import java.io.*;
import java.util.Arrays;

/**
 * Description  字符流  FileInputStream   FileReader
 * FileOutputStream  FileWriter
 * Author ayt  on
 */
public class TestFileReader {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        FileWriter writer = new FileWriter(file, true);
        byte[] bytes = "这是一个大世界，很大很大".getBytes();

        writer.write(new String(bytes));
        //刷新流对象中的缓冲中的数据
        //将数据刷到目的地中
        writer.flush();
        //关闭流资源，但是关闭之前会刷新一次内部的缓冲中的数据。
        //将数据刷到目的地中去。
        //和flush区别：flush 刷新后，流可以继续使用，close刷新后，会将流关闭
        writer.close(); //流必须要关闭，才能写入成功

        FileReader reader = new FileReader(file);
        char[] chars = new char[1024];
        reader.read(chars);
        System.out.println();

    }


}
