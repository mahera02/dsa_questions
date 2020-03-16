package org.mradhika.projects.leetcode.medium;

import java.util.*;

public class Subsets {
	public static List<List<Integer>> subsets(int[] nums) {

		List<List<Integer>> list = new ArrayList<>();
		backtracking(list, new ArrayList<>(), 0, nums);

		return list;
	}

	public static void backtracking(List<List<Integer>> list, List<Integer> temp, int start, int[] nums) {

		list.add(new ArrayList<>(temp));

		for (int i = start; i < nums.length; i++) {
			temp.add(nums[i]);
			backtracking(list, temp, i + 1, nums);
			temp.remove(temp.size() - 1);
		}
	}
	
	
	public static void main(String[] args) {
		Subsets.subsets(new int[] {1,2,3});
	}
}
