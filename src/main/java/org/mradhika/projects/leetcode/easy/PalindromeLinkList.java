package org.mradhika.projects.leetcode.easy;

public class PalindromeLinkList {
	 public boolean isPalindrome(ListNode head) {
	        
	        ListNode slow = head;
	        ListNode fast = head;
	        if(head==null)
	            return true;
	        ListNode fastPrev = null;
	        while(fast!=null && fast.next!=null)
	        {
	            slow = slow.next;
	            fastPrev = fast;
	            fast=fast.next.next;
	            
	        }
	        fast = fast==null ? fastPrev.next : fast;
	        ListNode prev = null;
	        
	        while(slow!=null){
	            ListNode temp = slow.next;
	            slow.next = prev;
	            prev = slow;
	            slow = temp;  
	        }
	        
	        while(fast!=null && head!=null){
	            if(fast.val!=head.val)
	                return false;
	            fast = fast.next;
	            head = head.next;
	        }
	        return true;
	        
	    }
}
