package org.mradhika.projects.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class ThirdMaxNum {

	public static void main(String[] args) {
		int[] newint = new int[] { 3, 4, 6, 5, 4, 5,7, 2, 1 };
		int result = ThirdMaxNum.thirdMax(newint);
		System.out.println(result);
	}

	
	// O(n)
	 public int thirdMaxFaster(int[] nums) {
	        
	        long firstMax = Long.MIN_VALUE;
	        long secondMax = Long.MIN_VALUE;
	        long thirdMax = Long.MIN_VALUE;
	        
	        for(int num : nums){
	            if(num == firstMax || num==secondMax || num==thirdMax) continue;
	            if(num>firstMax){
	                thirdMax = secondMax;
	                secondMax=firstMax;
	                firstMax= num;
	            }
	            else if(num>secondMax){
	                thirdMax = secondMax;
	                secondMax = num;
	            }
	            else if(num>thirdMax){
	                thirdMax=num;
	            }
	            
	        }
	        //If no third max then return maximum
	        if(thirdMax==Long.MIN_VALUE) return (int)firstMax;
	            else  return (int)thirdMax;
	        
	    }
	 
	 public static int thirdMaxPQ(int[] nums) {
	        PriorityQueue<Integer> q = new PriorityQueue<>();
	        for(int n : nums){
	          if(!q.contains(n)){
	               q.add(n);
	          }
	            if(q.size()>3){
	                q.poll();
	            }
	        }
	         if(q.size()<3){
	                while(q.size()>1)
	                    q.poll();
	            }
	        return q.peek();
	        
	    }
	public static int thirdMax(int[] nums) {
		int count = 0;
		Arrays.sort(nums);
		int max = nums[nums.length - 1];
		System.out.println(max);
		Set<Integer> set = new HashSet<Integer>();

		for (int i = nums.length - 1; i >= 0; i--) {
			if (!set.contains(nums[i])) {
				set.add(nums[i]);
				count++;
			}
			if (count == 3) {
				return nums[i];
			}
		}

		return max;

	}

}
