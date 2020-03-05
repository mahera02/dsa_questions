package org.mradhika.projects.leetcode.medium;

import java.util.Arrays;

public class LongestIncreasingSubSeq {

	public static void main(String[] args) {
		int[] nums = new int[] { 10, 9, 2, 5, 3, 7, 101, 18 };
		LongestIncreasingSubSeq.lengthOfLIS(nums);
	}

	// O(n2) complexity
	public int lengthOfLISForLoops(int[] nums) {

		if (nums.length == 0)
			return 0;
		
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		int maxLen = 1;
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			maxLen = Math.max(maxLen, dp[i]);
		}
		return maxLen;
	}

	// O(nlogn) binary search 
	public static int lengthOfLIS(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		int len = 0;
		int[] arr = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int bsIndex = Arrays.binarySearch(arr, 0, len, nums[i]);
			if (bsIndex < 0) {
				bsIndex = -(bsIndex + 1);
			}
			arr[bsIndex] = nums[i];
			if (len == bsIndex) {
				len++;
			}
		}
		return len;
	}

}
