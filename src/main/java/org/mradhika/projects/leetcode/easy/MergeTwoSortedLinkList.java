package org.mradhika.projects.leetcode.easy;

public class MergeTwoSortedLinkList {
	
	//Iterative Way
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		ListNode l3 = new ListNode(0);
		ListNode dummy = l3;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				l3.next = l1;
				l1 = l1.next;
				l3 = l3.next;
			} else {
				l3.next = l2;
				l2 = l2.next;
				l3 = l3.next;
			}
		}

		l3.next = l1 == null ? l2 : l1;

		return dummy.next;

	}
	
	//Recursion
	
	public ListNode mergeTwoListsRecursion(ListNode l1, ListNode l2){
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
}
}
