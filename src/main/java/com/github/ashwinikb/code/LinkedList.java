package com.example.ashwinikb;

public class LinkedList {
	static ListNode head;

	public static void addLinkedList(ListNode node) {
		if (head == null) {
			head = node;
		}
		ListNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
			temp.next = node;
		}
	}

	public static void printList(ListNode printNode) {
		ListNode temp = printNode;
		while (temp != null) {
			System.out.format("%d ", temp.val);
			temp = temp.next;
		}
		System.out.println();
	}

	public static ListNode addTwoNumbers(ListNode L1, ListNode L2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = L1, q = L2, current = dummyHead;

		int carry = 0;

		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;

			int sum = carry + x + y;

			carry = sum / 10;

			current.next = new ListNode(sum % 10);
			current = current.next;

			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			current.next = new ListNode(carry);
		}
		return dummyHead.next;

	}

}
