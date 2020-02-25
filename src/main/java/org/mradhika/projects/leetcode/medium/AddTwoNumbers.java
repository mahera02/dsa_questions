package org.mradhika.projects.leetcode.medium;

public class AddTwoNumbers {

	/*
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) 
	 * Output: 7 -> 0 -> 8 Explanation: 342 + 465 = 807.
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		ListNode result = new ListNode(0);
		ListNode l3 = result;
		while (l1 != null && l2 != null) {
			int sum = l1.val + l2.val + carry;
			carry = sum / 10;
			l3.next = new ListNode(sum % 10);
			l3 = l3.next;
			l1 = l1.next;
			l2 = l2.next;
		}

		while (l1 != null) {
			int sum = l1.val + carry;
			carry = sum / 10;
			l3.next = new ListNode(sum % 10);
			l3 = l3.next;
			l1 = l1.next;
		}
		while (l2 != null) {
			int sum = l2.val + carry;
			carry = sum / 10;
			l3.next = new ListNode(sum % 10);
			l3 = l3.next;
			l2 = l2.next;
		}
		if (carry > 0) {
			l3.next = new ListNode(carry);
		}

		return result.next;

	}
}
