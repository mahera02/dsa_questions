package org.mradhika.projects.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthNaryTree {
	public int maxDepthDFS(Node root) {

		if (root == null)
			return 0;

		int max = 0;
		for (Node n : root.children) {
			max = Math.max(max, maxDepthDFS(n));
		}

		return 1 + max;

	}

	public int maxDepthIterativeBFS(Node root) {

		 
	       if(root==null)
	           return 0;
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		int depth = 0;
		while (!q.isEmpty()) {

			int size = q.size();
			for (int i = 0; i < size; i++) {

				Node n = q.poll();

				for (Node child : n.children)
					q.add(child);

			}
			depth++;
		}
		return depth;

	}
}
