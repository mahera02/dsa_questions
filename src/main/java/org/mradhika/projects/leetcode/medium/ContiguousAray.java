package org.mradhika.projects.leetcode.medium;

import java.util.HashMap;

public class ContiguousAray {
	  public int findMaxLength(int[] nums) {
	        int maxLen =0;
	        int count=0;
	        HashMap<Integer,Integer> map = new HashMap<>();
	        map.put(0,-1);
	        for(int i = 0;i<nums.length;i++){
	            if(nums[i]==1)
	                count++;
	            else
	                count--;
	         if(map.containsKey(count)){
	             maxLen=Math.max(maxLen,i-map.get(count));
	         }   
	            else
	                map.put(count,i);
	        }
	        return maxLen;
	    }
}
