package com.example.ashwinikb;

public class MergeTwoLinkedList {
	
//	public void addToTheLast(ListNode node) {
//		 ListNode head = null;
//		if (head == null) {
//			head = node;
//		} else {
//			ListNode temp = head;
//			while (temp.next != null)
//				temp = temp.next;
// 
//			temp.next = node;
//		}
//	}

	public void printList(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.val);
			temp = temp.next;
		}
		System.out.println();
	}
	public static ListNode mergeLInkedList(ListNode L1, ListNode L2) {
		ListNode head = new ListNode(0);
		ListNode p = head;
		if (L1 == null) {
			p.next = L2;
		}
		else if (L2 == null) {
			p.next = L1;
		}
		else if (L1.val > L2.val) {
			p.next = L2;
			L2 = L2.next;
		} else {
			p.next = L1;
			L1 = L1.next;
		}
		p = p.next;

		return head.next;

	}
	
}
