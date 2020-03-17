package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {
	public int findDuplicate(int[] nums) {

		// based on tortoise hare detection algorithm
		int slow = nums[0];
		int fast = nums[0];
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];

		} while (slow != fast);

		int ptr1 = nums[0];
		int ptr2 = slow;

		while (ptr1 != ptr2) {
			ptr1 = nums[ptr1];
			ptr2 = nums[ptr2];
		}

		return ptr1;
	}

	public int findDuplicate2(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			int index = Math.abs(nums[i]);
			if (nums[index - 1] >= 0) {

				nums[index - 1] = -nums[index - 1];
			} else
				return Math.abs(nums[i]);
		}
		return -1;

	}
}
