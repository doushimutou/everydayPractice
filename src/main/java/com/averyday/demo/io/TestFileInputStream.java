package com.averyday.demo.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Description  文件操作类   使用的是字节流
 * Author ayt  on
 */
public class TestFileInputStream {
    public static void main(String[] args) {
        try {
            //将数据写入文件
            FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
            byte[] bytes = "我有一只小毛驴，我从来也不骑".getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            //从文件读取数据
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            byte[] inbytes = new byte[1024];
            fileInputStream.read(inbytes);
            System.out.println(new String(inbytes));
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
