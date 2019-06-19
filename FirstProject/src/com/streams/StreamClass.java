package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Starting with a list of numbers, use loops to:
//			​Find the max value.
//			Find the min value.
//			Remove the odd numbers.
//			Remove the even numbers.
//			Find the sum of the list.
//			Square every number in the list then remove the even numbers and then find the min value.
		
		List<Integer>nums= Arrays.asList(1,2,3,4,5,6,7, 8, 9, 11);
		int sum=0;
		sum=nums.stream().reduce((a,b) -> a+b).get();
	System.out.println(sum);
		

	}

	private static int squareRemoveMin(List<Integer> nums) {
		int minNum= nums.stream().map(i -> i*i).filter(i->i%2==0).reduce((a, b) -> Math.min(a, b)).get();
		return minNum;
	}

	private static void loopMax(List<Integer> nums) {
		int biggest=0, current = 0;
		for(int i: nums) {
			current=i;
			if(current>biggest) {
				biggest=current;
			}
		
		}
		System.out.println(biggest);
	}

	private static int returnMax(List<Integer> nums) {
		int maxNum= nums.stream().reduce((a,b) -> Math.max(a, b)).get();
		return maxNum;
	}

	private static List<Integer> squareNums(List<Integer> nums) {
		nums=nums.stream().map(i -> i*i).collect(Collectors.toList());
		return nums;
	}

}
