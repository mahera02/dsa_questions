package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class PathSumTwo {

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> list = new ArrayList<>();
		calcSum(root, sum, 0, list, new ArrayList<>());
		return list;
	}

	public void calcSum(TreeNode root, int sum, int total, List<List<Integer>> list, List<Integer> temp) {

		if (root == null)
			return;
		total += root.val;
		temp.add(root.val);
		if (root.left == null && root.right == null && total == sum) {
			list.add(new ArrayList<>(temp));
		}
		if (root.left != null) {
			calcSum(root.left, sum, total, list, temp);
			temp.remove(temp.size() - 1);
		}
		if (root.right != null) {
			calcSum(root.right, sum, total, list, temp);
			temp.remove(temp.size() - 1);
		}

	}
}
