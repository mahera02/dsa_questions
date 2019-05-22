package org.mradhika.projects.leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaxMinDepthOfBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(5);
		
		System.out.println(new MaxMinDepthOfBinaryTree().maxDepthDfs(root));
		// TODO Auto-generated method stub

	}

/*Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its depth = 3.
*/
	
	public int maxDepthDfs(TreeNode root) {
		return root ==null ? 0 : (1 + Math.max(maxDepthDfs(root.left), maxDepthDfs(root.right)));
	}
	  public int maxDepth(TreeNode root) {
	        
	        if(root==null) return 0;
	        int level = 0;
	        Queue<TreeNode> q = new LinkedList<>();
	        q.add(root);
	        q.add(null);
	        
	        while(!q.isEmpty()){
	            TreeNode node = q.poll();
	            if(node!=null){
	                if(node.left!=null) q.add(node.left);
	                if(node.right!=null) q.add(node.right);
	            }
	            else{
	                level++;
	                if(!q.isEmpty()) q.add(null);
	                }
	        }
	        return level;
	    }
	  /*
	   * Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7
return its minimum depth = 2.
	   */
	  public int minDepth(TreeNode root) {
	        if(root==null) return 0;
	        int level = 0;
	        Queue<TreeNode> q = new LinkedList<>();
	        q.add(root);
	        q.add(null);
	        
	        while(!q.isEmpty()){
	            TreeNode node = q.poll();
	            if(node!=null){
	                if(node.left==null && node.right==null) return level+1;
	                if(node.left!=null) q.add(node.left);
	                if(node.right!=null) q.add(node.right);
	            }
	            else{
	                level++;
	                if(!q.isEmpty()) q.add(null);
	                }
	        }
	        return level;
	    }
}
