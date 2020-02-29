package org.mradhika.projects.leetcode.easy;

public class InvertBinaryTree {
	
	/*
Example 1:

Input: 
	Tree 1                                    
          1                                                     
         / \                                                  
        3   2                                             
       /                                                
      5                                               

  */
	
	  public static TreeNode invertTree(TreeNode root) {
	        
	        if(root==null)
	            return null;
	        TreeNode temp = root.left;
	        root.left = root.right;
	        root.right = temp;
	        
	        TreeNode right =  invertTree(root.right);
	        TreeNode left =  invertTree(root.left);
	        
	        return root;
	        
	    }
	  
	  public static void main(String[] args) {
			TreeNode t1 = new TreeNode(1);
			t1.left = new TreeNode(3);
			t1.right = new TreeNode(2);
			t1.left.left = new TreeNode(5);
	
			 TreeNode t = InvertBinaryTree.invertTree(t1);
		}

}
