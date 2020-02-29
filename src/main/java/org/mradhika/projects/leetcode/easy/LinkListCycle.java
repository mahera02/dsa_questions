package org.mradhika.projects.leetcode.easy;

public class LinkListCycle {

	/**
	 * Definition for singly-linked list. class ListNode { int val; ListNode next;
	 * ListNode(int x) { val = x; next = null; } }
	 */
	public boolean hasCycle(ListNode head) {

		if (head == null)
			return false;

		ListNode slow = head;
		ListNode fast = head.next;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}

	// LinkListCycle 2
	public ListNode detectCycle(ListNode head) {

		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				slow = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}
}
