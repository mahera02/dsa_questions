package org.mradhika.projects.leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

public class MinStack {
	    /** initialize your data structure here. */
	    Stack<Integer> s ;
	    public MinStack() {
	        s = new Stack<>();
	    }
	    
	    public void push(int x) {
	    	int y;
	    	if(!s.isEmpty()) {
	    		y = getMin();
	    	}else {
	    		y=x;
	    	} 
	    	s.push(x);
	    	s.push(Math.min(x,y));
	    }
	    
	    public void pop() {
	        s.pop();
	        s.pop();
	    }
	    
	    public int top() {
	        int min = s.pop();
	        int top =  s.peek();
	        s.push(min);
	        return top;
	    }
	    
	    public int getMin() {
	        
	          return s.peek();
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
		  obj.push(2);
		  obj.push(0);
		  obj.push(3);
		  obj.push(0);
		 // obj.pop();
		  
		  System.out.println("min" + obj.getMin());
		  obj.pop();
		  System.out.println("pop  "  );
		  System.out.println("min" + obj.getMin());
		  obj.pop();
		  System.out.println("pop  "  );
		  System.out.println("min" + obj.getMin());
		  obj.pop();
		  System.out.println("pop  "  );
		  System.out.println("min" + obj.getMin());
		  
		 

	}

}
