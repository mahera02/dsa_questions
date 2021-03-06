package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {
	
	//O(n) time and O(1) space - key to note
	public List<Integer> findDuplicates(int[] nums) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i= 0;i<nums.length;i++) {
			
			int index = Math.abs(nums[i]);
			if(nums[index-1]>=0) {
				
				nums[index-1] = -nums[index-1];
			}
			else
				list.add(Math.abs(nums[i]));
		}
		return list;
		
	}
}
