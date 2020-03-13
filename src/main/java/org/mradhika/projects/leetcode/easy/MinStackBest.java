package org.mradhika.projects.leetcode.easy;

public class MinStackBest {
	/** initialize your data structure here. */
	private Node head;

	public MinStackBest() {
      
    }

	public void push(int x) {
		if (head == null) {
			head = new Node(x, x);
		} else {
			head = new Node(x, Math.min(x, head.min), head);
		}
	}

	public void pop() {
		head = head.next;
	}

	public int top() {
		return head.val;
	}

	public int getMin() {
		return head.min;
	}

	public class Node {
		int val;
		int min;
		Node next;

		public Node(int val, int min, Node next) {
			this.val = val;
			this.min = min;
			this.next = next;
		}

		public Node(int val, int min) {
			this.val = val;
			this.min = min;
		}

	}
	
	public static void main(String[] args) {
		MinStackBest obj = new MinStackBest();
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
