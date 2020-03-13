package org.mradhika.projects.leetcode.easy;

import java.util.Deque;
import java.util.LinkedList;

public class MinStackUsingTwoDeque {
	/** initialize your data structure here. */
	Deque<Integer> stack = new LinkedList<>();
	Deque<Integer> minstack = new LinkedList<>();

	public MinStackUsingTwoDeque() {

	}

	public void push(int x) {

		if (minstack.isEmpty() || x <= minstack.peek())
			minstack.push(x);
		stack.push(x);
	}

	public void pop() {
		int x = stack.pop();
		if (x == minstack.peek())
			minstack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minstack.peek();
	}
}
