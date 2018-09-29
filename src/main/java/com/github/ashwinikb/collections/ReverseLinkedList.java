package com.github.ashwinikb.collections;

public class ReverseLinkedList {
	// Without using LinkedList interface.
	private static Node head;

	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
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

	public static Node reverseLinkedList(Node currentNode) {
		Node previousNode = null;
		Node nextNode;
		while (currentNode != null) {
			nextNode = currentNode.next;
			currentNode.next = previousNode;
			previousNode = currentNode;
			currentNode = nextNode;
		}
		return previousNode;

	}

}
