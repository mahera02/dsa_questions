package org.mradhika.projects.leetcode.easy;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Objects;

public class SingleNumber {

	// first attempt
	public static int singleNumber(int[] nums) {
		/* int res=0;
	        for (int i=0;i<nums.length;i++){
	            res = res ^ nums[i]; 
	        }
	        return res;*/
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				map.replace(nums[i], map.get(nums[i]) + 1);
			}
		}
		for (Entry entry : map.entrySet()) {
			if (Objects.equals(1, entry.getValue())) {
				return (int) entry.getKey();
			}
		}
		return 0;
	}
       //O(n)
	   public int singleNumberXOR(int[] nums) {
	        int result =0;
	        for(int i = 0; i<nums.length;i++){
	           result = result ^ nums[i];
	        }
	        return result;
	    }
	public static void main(String[] args) {
		System.out.println(SingleNumber.singleNumber(new int[] { 2, 3, 1, 4, 1, 2, 3 }));

	}

}
