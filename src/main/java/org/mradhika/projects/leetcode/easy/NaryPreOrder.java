package org.mradhika.projects.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class NaryPreOrder {
	  public List<Integer> preorder(Node root) {
	         List<Integer>  list  = new ArrayList<>();
	          preOrderList(list,root);
	        return list;
	    }
	    
	    public void preOrderList(List<Integer>  list, Node node){
	        
	        if(node==null)
	            return;
	        list.add(node.val);
	        
	        for(Node child : node.children){
	             preOrderList(list,child);
	        }
	        
	    }
}
