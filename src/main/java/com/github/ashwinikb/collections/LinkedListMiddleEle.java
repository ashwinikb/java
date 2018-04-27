
package com.github.ashwinikb.collections;

import java.util.LinkedList;

/**
 * @author ashwini
 *
 */
public class LinkedListMiddleEle {
	// Without using LinkedList interface.
		private static Node head;

	public static void main(String[] args) {
		LinkedListMiddleEle list = new LinkedListMiddleEle();
		Node head = new Node(5);
		list.addElement(head);
		list.addElement(new Node(6));
		list.addElement(new Node(7));
		list.addElement(new Node(1));
		list.addElement(new Node(2));
		
		list.printList();
		
		Node middle = list.findElemnt(head);
		System.out.println("Middle node is:" + middle.value);
		

	}

	
	private static class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
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
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	// Finding middle element in LinkedList.
	public Node findElemnt(Node head) {
		Node slowPointer, fastPointer;
		slowPointer = fastPointer = head;

		while (fastPointer != null) {
			fastPointer = fastPointer.next;
			if (fastPointer != null && fastPointer.next != null) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;

			}
		}

		return slowPointer;

	}

}
