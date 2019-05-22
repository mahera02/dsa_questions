package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigZagTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
  /*
	Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

			For example:
			Given binary tree [3,9,20,null,null,15,7],
			    3
			   / \
			  9  20
			    /  \
			   15   7
			return its zigzag level order traversal as:
			[
			  [3],
			  [20,9],
			  [15,7]
			]
	*/		
	  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
	        
	        List<List<Integer>> results = new ArrayList<>();
	        if (root==null) return results;
	        Queue <TreeNode> q = new LinkedList<>();
	        int level =0;
	        results.add(new ArrayList<>()); 
	        q.add(root);
	        q.add(null); // to show new level or end of previous level
	        
	        while(!q.isEmpty()){
	            TreeNode node = q.poll();                        
	            if (node!=null) {
	                if (level%2==0){
	                    // even - left to right
	                    results.get(level).add(node.val);
	                }else{
	                    // even - right to left
	                    results.get(level).add(0, node.val);
	                }
	                
	                if (node.left!=null) q.add(node.left);
	                if (node.right!=null) q.add(node.right);
	                
	            }else {
	                // null means new level or end of previous level
	                level++;
	                if(!q.isEmpty())
	                   results.add(new ArrayList<>()); 
	                if (!q.isEmpty())q.add(null);
	            }
	        }
	        return results;
	    }
}
