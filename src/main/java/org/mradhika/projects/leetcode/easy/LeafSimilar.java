package org.mradhika.projects.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilar {
	 public boolean leafSimilar(TreeNode root1, TreeNode root2) {
	        List<Integer> leaf1 = new ArrayList<>();
	        List<Integer> leaf2 = new ArrayList<>();
	        
	        dfs(root1,leaf1);
	        dfs(root2,leaf2);
	        
	        return leaf1.equals(leaf2);
	    }
	    
	    public void dfs(TreeNode root, List<Integer> leaf){
	        
	        if(root==null)
	            return;
	        if(root.left==null && root.right==null)
	            leaf.add(root.val);
	        dfs(root.left,leaf);
	        dfs(root.right,leaf);
	        
	    }
}
