package org.mradhika.projects.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
	    
//	    Iterative
	    
	    public List<Integer> preorderIterative(Node root) {
	         List<Integer>  list  = new ArrayList<>();
	         
	        if(root==null)
	            return list;
	        Stack<Node> stack = new Stack<>();
	        stack.push(root);
	        
	        while(!stack.isEmpty()){
	            Node interim = stack.pop();
	            list.add(interim.val);
	            
	            for(int i = interim.children.size()-1 ; i>=0 ;i--){
	                stack.push(interim.children.get(i));
	            }
	            
	            
	        }
	        return list;
	        
	        
	    }
}
