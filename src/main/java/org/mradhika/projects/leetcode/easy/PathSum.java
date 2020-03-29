package org.mradhika.projects.leetcode.easy;

public class PathSum {
	public static boolean hasPathSum(TreeNode root, int sum) {
		int total = 0;

		return calcSum(root, sum, total);

	}

	public static boolean calcSum(TreeNode root, int sum, int total) {
		if (root == null)
			return false;
		total = total + root.val;
		if (root.left == null && root.right == null && sum == total)
			return true;

		return calcSum(root.left, sum, total) || calcSum(root.right, sum, total);
	}
	
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(5);
		t1.left = new TreeNode(4);
		t1.right = new TreeNode(8);
		t1.left.left = new TreeNode(11);
		t1.right.left = new TreeNode(13);
		t1.right.right = new TreeNode(4);
		t1.left.left.left = new TreeNode(7);
		t1.left.left.right = new TreeNode(2);
		t1.right.right.right = new TreeNode(1);


		 boolean t = PathSum.hasPathSum(t1,22);
		 System.out.println(t);
	}
}
