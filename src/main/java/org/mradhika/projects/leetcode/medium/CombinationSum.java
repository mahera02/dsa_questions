package org.mradhika.projects.leetcode.medium;

import java.util.*;

public class CombinationSum {

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {

		// Arrays.sort(candidates);
		List<List<Integer>> list = new ArrayList<>();
		backtracking(list, new ArrayList<>(), candidates, 0, target);
		return list;

	}

	public static void backtracking(List<List<Integer>> list, List<Integer> temp, int[] candidates, int start, int target) {
		if (target < 0)
			return;
		if (target == 0)
			list.add(new ArrayList<>(temp));

		else {
			for (int i = start; i < candidates.length; i++) {
				temp.add(candidates[i]);
				backtracking(list, temp, candidates, i, target - candidates[i]);
				temp.remove(temp.size() - 1);
			}
		}

	}

	public static void main(String[] args) {
		CombinationSum.combinationSum(new int[] {2,3,6,7},7);
	}
}
