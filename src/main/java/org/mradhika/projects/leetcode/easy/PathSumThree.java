package org.mradhika.projects.leetcode.easy;

import java.util.HashMap;

public class PathSumThree {

	static int count = 0;

	//O(n2)
	public int pathSum(TreeNode root, int sum) {
		int total = 0;
		if (root == null)
			return 0;
		calcSum(root, sum, total);
		pathSum(root.left, sum);
		pathSum(root.right, sum);

		return count;
	}

	public void calcSum(TreeNode root, int sum, int total) {
		if (root == null)
			return;
		total = total + root.val;
		if (sum == total)
			count++;

		calcSum(root.left, sum, total);
		calcSum(root.right, sum, total);
	}

	
	//O(n)
	public static int pathSumBetter(TreeNode root, int sum) {

		// key : the prefix sum, value : how many ways get to this prefix sum
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		helper(root, 0, sum, map);
		return count;

	}

	public static void helper(TreeNode root, int currSum, int target, HashMap<Integer, Integer> map) {

		if (root == null)
			return;
		currSum += root.val;

		// same as in TwoSum
		if (map.containsKey(currSum - target)) {
			count += map.get(currSum - target);
		}

		if (!map.containsKey(currSum)) {
			map.put(currSum, 1);
		} else {
			map.put(currSum, map.get(currSum) + 1);
		}
		helper(root.left, currSum, target, map);
		helper(root.right, currSum, target, map);
		map.put(currSum, map.get(currSum) - 1);

	}

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(10);
		t1.left = new TreeNode(5);
		t1.right = new TreeNode(-3);
		t1.left.left = new TreeNode(3);
		t1.left.right = new TreeNode(2);
		t1.right.right = new TreeNode(11);
		t1.left.left.left = new TreeNode(3);
		t1.left.left.right = new TreeNode(-2);
		t1.left.right.right = new TreeNode(1);

		int t = PathSumThree.pathSumBetter(t1, 8);
		System.out.println(t);
	}
}
