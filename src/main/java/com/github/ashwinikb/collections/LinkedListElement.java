/**
 * 
 */
package com.github.ashwinikb.collections;

public class LinkedListElement {
	private static Node head;

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void addElement(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	public void printList() {
		Node temp = head;
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public Node nthElementLastNode(Node head, int n) {
		Node fastPointer = head;
		Node slowPointer = head;

		for (int i = 0; i < n; i++) {
			fastPointer = fastPointer.next;
		}
		while (fastPointer != null) {
			fastPointer = fastPointer.next;
			slowPointer = slowPointer.next;
		}
		return slowPointer;
	}

}
