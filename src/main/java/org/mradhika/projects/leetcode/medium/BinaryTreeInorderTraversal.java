package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

	// Recursion
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		inorderTraversal(root, list);
		return list;

	}

	public void inorderTraversal(TreeNode root, List<Integer> list) {
		if (root != null) {
			inorderTraversal(root.left, list);
			list.add(root.val);
			inorderTraversal(root.right, list);
		}
	}

	// Iterative

	public List<Integer> inorderTraversalIterative(TreeNode root) {
		List<Integer> list = new ArrayList<>();

		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		while(node!=null || !stack.isEmpty()) {
			
			while(node!=null) {
				node = stack .push(node);
				node = node.left;
			}
			node = stack .pop();
			list.add(node.val);
			node = node.right;
		}

		return list;

	}

}
