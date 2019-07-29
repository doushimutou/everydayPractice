package com.averyday.demo.io;


import java.io.*;
import java.util.Arrays;

/**
 * Description
 * Author ayt  on  有内部缓存机制
 */
public class TestBufferReader {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(new File("test.txt"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            try {
                String[] b = new String[1024];
                String a = bufferedReader.readLine();
                while (a != null) {
                    Arrays.fill(b, a);
                    System.out.println(b[0]);
                    a = bufferedReader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
