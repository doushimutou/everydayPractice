package com.averyday.demo.Arithmetic;

import java.util.Arrays;

/**
 * Description
 * Author ayt  on
 * 选择排序
 */
public class SelectSort {
	public static void main(String[] args) {
		int arr[] = {5,7,1,6,11};
		for (int i = 0; i <arr.length ; i++) {
			int min = arr[i];
			int index =  i;
			for (int j = i+1; j < arr.length ; j++) {
				if (min > arr[j]){
					min = arr[j];
					index = j ;
				}
			}
			int temp = arr[i];
			arr[i] = min;
			arr[index] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
