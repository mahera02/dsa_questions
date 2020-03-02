package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int left = i + 1;
				int right = nums.length - 1;
				int sum = 0 - nums[i];
				while (left < right) {
					if (nums[left] + nums[right] > sum) {
						right--;
					} else if (nums[left] + nums[right] < sum) {
						left++;
					} else {
						List<Integer> l = new ArrayList<>();
						l.add(nums[left]);
						l.add(nums[right]);
						l.add(nums[i]);
						list.add(l);
						while (left < right && nums[left] == nums[left + 1])
							left++;
						while (left < right && nums[right] == nums[right - 1])
							right--;
						left++;
						right--;

					}

				}

			}
		}

		return list;

	}
}
