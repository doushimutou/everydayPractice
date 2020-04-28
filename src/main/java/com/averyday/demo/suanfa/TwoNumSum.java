package com.averyday.demo.suanfa;

import java.util.*;
import java.util.function.BiFunction;

/**
 * Description
 * Author ayt  on
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

 */
public class TwoNumSum {
	public static void main(String[] args) {
		int[] nums = {1,1,1};
		System.out.println(test(nums));
	}
	public static Integer test(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i =0 ;i<nums.length;i++){
			if(map.get(nums[i]) == null){
				map.put(nums[i],1);
			}else{
				map.put(nums[i],map.get(nums[i])+1);
			}
		}
		Set<Integer>  set = new HashSet<>();
		for (Map.Entry<Integer,Integer> entry : map.entrySet()){
			entry.getKey();
			if(entry.getValue()== 1){
				int a =	entry.getKey();
				set.add(a);
			}
		}
		set.forEach( integer -> {
			map.remove(integer);
		});
		return  (Integer) map.keySet().toArray()[0];

	}
}
