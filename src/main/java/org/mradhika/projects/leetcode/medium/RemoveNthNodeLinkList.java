package org.mradhika.projects.leetcode.medium;

public class RemoveNthNodeLinkList {

	 public ListNode removeNthFromEnd(ListNode head, int n) {
         ListNode slow = head;
         ListNode fast = head;
        
        while(n>0){
            fast = fast.next;
            n--;
        }
        if(fast==null) return head.next;
        fast = fast.next;
        while(fast!=null){
            
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
        
    }
	
}
