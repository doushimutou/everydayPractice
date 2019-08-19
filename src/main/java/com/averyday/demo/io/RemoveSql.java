package com.averyday.demo.io;

import java.io.*;
import java.util.HashMap;

/**
 * Description
 * Author ayt  on
 */
public class RemoveSql {
    public static void main(String[] args) {
        try {
            //读
            File file = new File("src/9_16_59_22_192.sql");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String allString = null;
            HashMap<Integer, String> baseString = new HashMap<>();
            int num = 0;
            while ((allString = reader.readLine()) != null) {
                num++;
                String re = allString.replace("dispatch_filter_info_history;", "dispatch_filter_info_history");
                baseString.put(num, re);
                System.out.println(re);
            }
            reader.close();
            //写
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            baseString.forEach((k, v) -> {
                try {
                    writer.write(v);
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
