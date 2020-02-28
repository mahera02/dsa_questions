package org.mradhika.projects.leetcode.easy;

public class InterdsectionOfTwoLinkLists {
	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; next = null; } }
	 */
	/*
	 * 8 [4,1,8,4,5] [5,0,1,8,4,5] 2 3
	 */
	// Method 1 - by finding length of both lists
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		if (headA == null || headB == null)
			return null;
		int lenA = findLength(headA);
		int lenB = findLength(headB);
		while (lenA < lenB) {
			headB = headB.next;
			lenB--;
		}
		while (lenA > lenB) {
			headA = headA.next;
			lenA--;
		}
		while (headA != headB) {
			headA = headA.next;
			headB = headB.next;
		}
		return headB;

	}

	public int findLength(ListNode head) {
		int count = 0;
		while (head != null) {
			count++;
			head = head.next;
		}
		return count;
	}

	// Method 2 - without findingn the length fo linklists

	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {

		if (headA == null || headB == null)
			return null;
		ListNode a = headA;
		ListNode b = headB;

		// if a & b have different len, then we will stop the loop after second
		// iteration
		while (a != b) {
			// for the end of first iteration, we just reset the pointer to the head of
			// another linkedlist
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}

		return a;
	}

}
