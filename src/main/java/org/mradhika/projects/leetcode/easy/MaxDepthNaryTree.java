package org.mradhika.projects.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxDepthNaryTree {
	
	public static void main(String[] args) {
		
		Node n5 = new Node(5, new ArrayList<>());
		Node n6 = new Node(6, new ArrayList<>());
		List<Node> childrenN2 = new ArrayList<>();
		childrenN2.add(n5);
		childrenN2.add(n6);
		Node n2 = new Node(3,childrenN2);
		Node n3 = new Node(2, new ArrayList<>());
		Node n4 = new Node(4, new ArrayList<>());
		List<Node> childrenN1 = new ArrayList<>();
		childrenN1.add(n2);
		childrenN1.add(n3);
		childrenN1.add(n4);
		Node n1 = new Node(1,childrenN1);
		
		 int res = MaxDepthNaryTree.maxDepthDFS(n1);
		 System.out.println(res);
	}
	
	public static int maxDepthDFS(Node root) {

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
