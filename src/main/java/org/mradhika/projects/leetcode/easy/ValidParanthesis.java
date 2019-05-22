package org.mradhika.projects.leetcode.easy;

import java.util.HashSet;
import java.util.Stack;

public class ValidParanthesis {

	/*
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order. Note that an empty string is also considered
	 * valid.
	 */

	// first attempt
	public static boolean isValid(String s) {
		if (s.isEmpty()) {
			return true;
		}
		boolean isValid = true;
		char[] ch = s.toCharArray();
		Stack<Character> paran = new Stack<>();
		if (ch.length == 1) {
			return false;
		}
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
				paran.push(ch[i]);
				isValid = false;
			} else {
				char top = 0;
				if (!paran.isEmpty()) {
					top = paran.pop().charValue();
					isValid = true;
				} else {
					isValid = false;
					break;
				}
				if (ch[i] == ')' && top != '(') {
					isValid = false;
					break;
				}
				if (ch[i] == '}' && top != '{') {
					isValid = false;
					break;
				}

				if (ch[i] == ']' && top != '[') {
					isValid = false;
					break;
				}
			}
		}
		if (paran.isEmpty() && isValid)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		boolean result = ValidParanthesis.isValidNew("([]");
		System.out.println(result);

	}

	public static boolean isValidNew(String s) {

		char[] ch = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		if (ch.length % 2 != 0)
			return false;

		for (char c : ch) {
			if (c == '(' || c == '[' || c == '{')
				stack.push(c);
			else {
				if (!stack.isEmpty()) {
					char ctop = stack.pop().charValue();

					if (ctop == '(' && c != ')')
						return false;
					if (ctop == '[' && c != ']')
						return false;
					if (ctop == '{' && c != '}')
						return false;
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
