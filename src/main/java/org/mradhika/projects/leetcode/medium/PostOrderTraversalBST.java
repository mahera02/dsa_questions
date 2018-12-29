package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversalBST {

	public List<Integer> postorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<>();

		postOrderTraversal(root, list);
		return list;

	}

	private void postOrderTraversal(TreeNode root, List<Integer> list) {

		if (root != null) {
			if (root.left != null) {
				postOrderTraversal(root.left, list);
			}
			if (root.right != null) {
				postOrderTraversal(root.right, list);
			}
			list.add(root.val);
		}

	}

	public static void main(String[] args) {

		PostOrderTraversalBST bst = new PostOrderTraversalBST();
		TreeNode node = new TreeNode(8);
		node.left = new TreeNode(7);
		node.right = new TreeNode(6);
		node.left.left = new TreeNode(1);
		node.left.right = new TreeNode(2);
        // postorder  1 2 7 6 8
		bst.postorderTraversal(node);
	}

}
