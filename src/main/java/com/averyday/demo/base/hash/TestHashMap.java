package com.averyday.demo.base.hash;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description
 * Author ayt  on
 */
public class TestHashMap {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hashMap = new HashMap<>(32, (float) 0.75);
		hashMap.put(123, 456);
		ConcurrentHashMap<String,Integer> hashMap1 = new ConcurrentHashMap();

	}
}
