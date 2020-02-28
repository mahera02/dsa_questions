package org.mradhika.projects.leetcode.easy;

import org.mradhika.projects.leetcode.easy.TreeNode;

public class MergeTwoBinaryTrees {
 /*
  * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.

You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Example 1:

Input: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
Output: 
Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7
  */
	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);
	
		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(3);
		t2.left.right = new TreeNode(4);
		t2.right.right = new TreeNode(7);
		 TreeNode t = MergeTwoBinaryTrees.mergeTrees(t1, t2);
	}

	   public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	        
	        //try dfs using inorder traversal.
	        if(t1==null) return t2;
	        if(t2==null) return t1;
	        
	        //root
	        t1.val = t1.val+t2.val;
	        //left
	        t1.left = mergeTrees(t1.left,t2.left);
	        //right
	        t1.right = mergeTrees(t1.right,t2.right);
	       
	        return t1;
	    }
}
