package org.mradhika.projects.leetcode.easy;

public class MajorityElement {
	  public int majorityElement(int[] nums) {
	        // Arrays.sort(nums);
	        // return nums[nums.length/2];
	        
	        // Moore's Algorithm
	        int major = nums[0];
	        int count = 0;
	        
	        for(int i = 0; i<nums.length ;i++){
	            if(count==0){
	                major = nums[i];
	            }
	             if(major==nums[i])
	                 count++;
	            else
	                count--;
	        }
	        
	        return major;
	    }
}
