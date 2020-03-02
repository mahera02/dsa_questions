package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	// recursive
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		levelOrder(root, list, 0);

		return list;
	}

	public void levelOrder(TreeNode node, List<List<Integer>> list, int level) {

		if (node == null)
			return;
		if (level >= list.size()) {
			list.add(new ArrayList<>());
		}
		list.get(level).add(node.val);
		levelOrder(node.left, list, level + 1);
		levelOrder(node.right, list, level + 1);
	}

	// iterative using queue
	public List<List<Integer>> levelOrderIterative(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();

		if (root == null)
			return list;
		Queue<TreeNode> que = new LinkedList<>();
		int level = 0;
		que.add(root);
		que.add(null);
		list.add(new ArrayList<>());
		while (!que.isEmpty()) {
			TreeNode node = que.poll();
			if (node != null) {
				list.get(level).add(node.val);
				if (node.left != null)
					que.add(node.left);

				if (node.right != null)
					que.add(node.right);

			} else {
				level++;
				if (!que.isEmpty()) {
					que.add(null);
					list.add(new ArrayList<>());
				}

			}

		}
		return list;

	}
}
