package com.averyday.demo.base.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * Description
 * Author ayt  on
 */
public class HashMapItrator {
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("aaaa", 2);
		hashMap.put("bbbb", 3);
		hashMap.put("dddd", 4);
		Integer a = 0;
		String b = "";
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue().compareTo(a) > 0) {
				a = entry.getValue();
				b = entry.getKey();
			}
		}
		System.out.println(b);


	}
}
