package org.mradhika.projects.leetcode.easy;

import java.util.Stack;

public class RemoveAdjacentString {

	 public String removeDuplicates(String S) {
	        
	        Stack<Character> stack =  new Stack<Character>();
	        char[] ch = S.toCharArray();
	        for(int i = 0;i<ch.length;i++){
	            
	            if(!stack.isEmpty() && stack.peek() == ch[i]){
	                stack.pop();
	            }
	            else{
	                stack.push(ch[i]);
	            }
	        }
	        StringBuilder s = new StringBuilder();
	        while(!stack.isEmpty()){
	            s.append(stack.pop());
	        }
	        return s.reverse().toString();
	        
	    }
}
