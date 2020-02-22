package org.mradhika.projects.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SymmetricTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(7);
		root.left = new TreeNode(8);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(5);
		

	}

	public boolean isSymmetric(TreeNode node) {

		Queue<TreeNode> q = new LinkedList<>();
		if (node == null)
			return true;
		q.add(node.left);
		q.add(node.right);

		while (!q.isEmpty()) {

			TreeNode nL = q.poll();
			TreeNode nR = q.poll();

			if (nL == null && nR == null) {
				continue;
			}
			if (nL == null ^ nR == null) {
				return false;
			}
			if (nL.val != nR.val)
				return false;
			q.add(nL.left);
			q.add(nR.right);
			q.add(nL.right);
			q.add(nR.left);
		}
		return true;
	}

	public boolean isSymmetricRecursion(TreeNode root) {
		return isMirror(root, root);
	}

	public boolean isMirror(TreeNode root1, TreeNode root2) {
		if (root1 == null && root2 == null) {
			return true;
		}
		if (root1 == null || root2 == null) {
			return false;
		}
		return root1.val == root2.val && isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
	}
}
