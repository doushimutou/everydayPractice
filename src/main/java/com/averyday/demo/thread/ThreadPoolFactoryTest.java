package com.averyday.demo.thread;

import java.util.Collection;
import java.util.HashMap;
import java.util.Stack;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Description
 * Author ayt  on
 */
public class ThreadPoolFactoryTest {
	public static int[] twoSum(int[] nums, int target) {
		for(int i= 0;i<nums.length;i++){
			for(int j = i+1;j<nums.length;j++){
				if((nums[i]+nums[j])==target){
					System.out.println(i);
					System.out.println(j);
					return  new int [] {i,j};
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution") ;
	}



	public  static void main(String[] args) {
		int[]  mum= {3,2,4};
	   int[]  nums =	twoSum(mum,6);

	}
}
