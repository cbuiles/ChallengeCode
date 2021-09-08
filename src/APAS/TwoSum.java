package APAS;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TwoSum {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Array = IntStream.of(2,7,11,15).toArray();
		
		for (int   number: twoSum(Array, 18)) {
			
			System.out.println(number);
			
		}
	
		

	}

}
