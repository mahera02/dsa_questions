package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversalBST {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		inOrderTraversal(root, list);
		return list;

	}

	public void inOrderTraversal(TreeNode node, List<Integer> list) {
		if (node != null) {
			if (node.left != null) {
				inOrderTraversal(node.left, list);
			}
			System.out.println(node.val+" ");
			list.add(node.val);

			if (node.right != null) {
				inOrderTraversal(node.right, list);
			}
		}
	}

	public static void main(String[] args) {

		InOrderTraversalBST bst = new InOrderTraversalBST();
		TreeNode node = new TreeNode(8);
		node.left = new TreeNode(7);
		node.right = new TreeNode(6);
		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(2);
				
		bst.inorderTraversal(node);
	}

}
