package APAS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * Given an array of integers, return indices of the two numbers such that add up to a specific target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 * */

public class TwoSum {
	
//	Custom answer
	public static int[] twoSum(int[] nums, int target) {
		
		int[] indexArray = new int[2];
		
		for(int i = 0 ; i < nums.length ; i ++) {
			
			for(int j = 0; j < nums.length; j++) {
			
				if(nums[i] + nums[j] == target && nums[i] != nums[j]) {
					
					indexArray[0] = i;
					
					indexArray[1] = j;
					
					break;
					
				}
			}
			
		}
		
		return indexArray;
		
	}
	
//	App answer
	public static int[] twoSum1(int[] nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length ; i ++) {
			
			int complement = target - nums[i];
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
			}
			
			map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two sum solution");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Array = IntStream.of(2,7,11,15).toArray();
		
		for (int   number: twoSum(Array, 18)) {
			
			System.out.println(number);
			
		}
	
		

	}

}
