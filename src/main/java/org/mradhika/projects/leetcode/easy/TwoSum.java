package org.mradhika.projects.leetcode.easy;

import java.util.HashMap;

public class TwoSum {

	/*
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * 
	 * Because nums[0] + nums[1] = 2 + 7 = 9, return [0, 1].
	 */

	// first attempt
	public int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
				}
			}

		}
		return result;
	}

	// O(n)
	public int[] twoSumNew(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(nums[i])) {
				return new int[] { map.get(nums[i]), i };
			} else {
				map.put(target - nums[i], i);
			}

		}
		return new int[] { -1, -1 };
	}
}