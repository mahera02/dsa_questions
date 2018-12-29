package org.mradhika.projects.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public void breadthFirstSearch(TreeNode node) {

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(node);

		while (!queue.isEmpty()) {

			TreeNode n = queue.poll();
			System.out.println(n.val);

			if (n.left != null) {
				queue.add(n.left);
			}

			if (n.right != null) {
				queue.add(n.right);
			}
		}
	}

	public static void main(String[] args) {

		BreadthFirstSearch bst = new BreadthFirstSearch();
		TreeNode node = new TreeNode(8);
		node.left = new TreeNode(7);
		node.right = new TreeNode(6);
		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(2);
		// breadthfirst 8 7 6 1 2
		bst.breadthFirstSearch(node);
	}

}
