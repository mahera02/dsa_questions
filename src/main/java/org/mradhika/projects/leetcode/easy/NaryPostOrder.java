package org.mradhika.projects.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class NaryPostOrder {
	   public List<Integer> postorder(Node root) {
	         List<Integer>  list  = new ArrayList<>();
	          postOrderList(list,root);
	        return list;
	    }
	    
	    public void postOrderList(List<Integer>  list, Node node){
	        
	        if(node==null)
	            return;
	        for(Node child : node.children){
	             postOrderList(list,child);
	        }
	        list.add(node.val);
	    
	    }
}
