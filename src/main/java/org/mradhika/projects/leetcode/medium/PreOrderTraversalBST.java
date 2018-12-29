package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversalBST {

	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<>();

		preOrderTraversal(root, list);
		return list;

	}

	private void preOrderTraversal(TreeNode root, List<Integer> list) {

		if (root != null) {
			list.add(root.val);
			if (root.left != null) {
				preOrderTraversal(root.left, list);
			}
			if (root.right != null) {
				preOrderTraversal(root.right, list);
			}

		}

	}

	public static void main(String[] args) {

		PreOrderTraversalBST bst = new PreOrderTraversalBST();
		TreeNode node = new TreeNode(8);
		node.left = new TreeNode(7);
		node.right = new TreeNode(6);
		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(2);
        // preorder 8 7 1 2 6
		bst.preorderTraversal(node);
	}

}
