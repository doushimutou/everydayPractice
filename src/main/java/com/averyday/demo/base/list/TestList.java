package com.averyday.demo.base.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Description
 * Author ayt  on
 */
public class TestList {
	public static void main(String[] args) {
		ArrayList<Integer>  arrayList = new ArrayList<>(10);
		arrayList.add(3);
		int[] data = new int[]{1,2,3};
		int[] data1 = Arrays.copyOf(data,2);

		HashSet<Integer> hashSet= new HashSet<>();
	}
}
