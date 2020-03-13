package org.mradhika.projects.leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

public class MinStack {
	    /** initialize your data structure here. */
	    Stack<Integer> s = new Stack<>();
	    int min = Integer.MAX_VALUE;;
	    public MinStack() {
	       
	    }
	    
	    public void push(int x) {
	    	if(x<=min) {
	    		s.push(min);
	    		min = x;
	    	}
	    	s.push(x);
	    }
	    
	    public void pop() {
	        int x = s.pop();
	        if(x==min)
	        	min=s.pop();
	    }
	    
	    public int top() {
	        return  s.peek();
	    }
	    
	    public int getMin() {
	        
	          return min;
	    }

	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(x);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */
	public static void main(String[] args) {
		MinStack obj = new MinStack();
		  obj.push(-2);
		  obj.push(0);
		  obj.push(-3);
		  //obj.push(0);
		 // obj.pop();
		  
		  System.out.println("min" + obj.getMin());
		  obj.pop();
		  System.out.println("pop  "  );
		  System.out.println("min" + obj.getMin());
		  
		  System.out.println("top" + obj.top());
		  //obj.pop();
		  //System.out.println("pop  "  );
		  System.out.println("min" + obj.getMin());
		 // obj.pop();
		 // System.out.println("pop  "  );
		 // System.out.println("min" + obj.getMin());
		  
		 

	}

}
