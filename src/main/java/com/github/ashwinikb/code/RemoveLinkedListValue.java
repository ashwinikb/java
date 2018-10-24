package com.example.ashwinikb;

public class RemoveLinkedListValue {
	
	public ListNode removeElement(ListNode head, int value) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode current = dummy;
		while(current.next != null) {
			if(current.next.val != value) {
				current.next = current.next.next;
			}else {
				current = current.next;
			}
		}
		return dummy.next;
		
	}

}
