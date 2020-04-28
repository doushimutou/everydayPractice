package com.averyday.demo.io;

import com.alibaba.druid.sql.visitor.functions.Char;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Description
 * Author ayt  on
 */
public class TestFile1 {
	public static void main(String[] args) throws IOException {
		String str = "abcdefadsd,7sdd";
		char[] chars = str.toCharArray();
		HashMap<String,Integer> stringIntegerHashMap = new HashMap<>();
		for (int i = 0; i <chars.length ; i++) {

			if(stringIntegerHashMap.get(chars[i])!=null){
			 Integer  value = 	stringIntegerHashMap.get(chars[i]);
			 stringIntegerHashMap.put(String.valueOf(chars[i]),value+1);
			}else {
				stringIntegerHashMap.put(String.valueOf(chars[i]),1);
			}
		}
		Integer[] values = (Integer[]) stringIntegerHashMap.values().toArray();
		Arrays.sort(values);

	}
}
