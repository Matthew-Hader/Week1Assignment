/**
 * 
 */
package com.ss.basics.recursion;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Matthew Hader
 *
 */
public class Recursion {
	
	public static void main(String[] args) {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Recursion test = new Recursion();
		
		try {
			//Get start from user
			System.out.print("Enter start: ");
			int start = Integer.parseInt(reader.readLine());
			
			//Get array of ints from user
			System.out.print("Enter array of numbers (numbers separated by spaces): ");
			String[] splitArray = reader.readLine().split(" ");
			int[] nums = new int[splitArray.length];
			for(int i = 0; i < splitArray.length; i++)
				nums[i] = Integer.parseInt(splitArray[i]);
			
			//Get target from user
			System.out.print("Enter target: ");
			int target = Integer.parseInt(reader.readLine());
			
			boolean targetMet = test.groupSumClump(start, nums, target);
			System.out.println(targetMet);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean groupSumClump(int start, int[] nums, int target) {
		if(start >= nums.length)
			return target == 0;
		
		int s = start;
		int sum = 0;
		
		while(s < nums.length && nums[start] == nums[s]) {
			sum += nums[s];
			s++;
		}
		if(groupSumClump(s, nums, target - sum))
			return true;
		if(groupSumClump(s, nums, target))
			return true;
		else
			return false;
	}
}
