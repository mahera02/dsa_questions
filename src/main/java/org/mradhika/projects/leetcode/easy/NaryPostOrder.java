package org.mradhika.projects.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

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
	    
	    //Iterative
	    public List<Integer> postorderIterative(Node root) {
	         List<Integer>  list  = new ArrayList<>();
		        if(root==null)
		            return list;
		        Stack<Node> stack = new Stack<>();
		        stack.push(root);
		        
		        while(!stack.isEmpty()){
		            Node interim = stack.pop();
		             list.add(interim.val);
	                for(int i = 0 ; i<interim.children.size() ;i++){
		                stack.push(interim.children.get(i));
		            }
		        }
	        Collections.reverse(list);
		        return list;
		        
	    }
}
