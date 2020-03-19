package org.mradhika.projects.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class RangeSumOfBST {

	int sum = 0;
	
	// better olution is DFS
	public int rangeSumBST(TreeNode root, int L, int R) {
		// Inorder travesal is sorted for BST
		rangeSum(root, L, R);
		return sum;

	}
	public void rangeSum(TreeNode root, int L, int R) {
		if (root != null) {
			if (root.val >= L && root.val <= R) {
				sum = sum + root.val;
			}
			if (root.val > L) {
				rangeSumBST(root.left, L, R);
			}
			if (root.val < R) {
				rangeSumBST(root.right, L, R);
			}

		}
	}
	
	public int rangeSumBSTUsingQueue(TreeNode root, int L, int R) {
		int total = 0;
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode n = q.poll();
			if(n!=null) {
				if(n.val>=L && n.val <=R)
					total +=n.val;
				if(n.val> L)
					q.add(n.left);
				if(n.val < R)
					q.add(n.right);
			}
		}
		return total;
	
	}
}
