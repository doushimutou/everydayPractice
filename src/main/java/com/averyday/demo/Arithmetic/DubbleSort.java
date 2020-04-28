package com.averyday.demo.Arithmetic;

import java.util.Arrays;

/**
 * Description
 * Author ayt  on
 * 冒泡排序
 */

public class DubbleSort {
	public static void main(String[] args) {
		int[] arr = {5, 7, 1, 6, 9};
		//最外层循环确定需要遍历的次数
		for (int i = 0; i < arr.length; i++) {
			//每一次遍历，将所有字符便利比较，且大小赋值排序
			for (int j = 0; j < i - 1; j++) {
				if (arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
