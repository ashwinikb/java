package com.github.ashwinikb.collections;

public class StackLinkedList {
	private Node head;

	private class Node {
		int value;
		Node next;
	}

	public void stackLinkedList() {
		head = null;
	}

	public int pop() throws LinkedListEmptyException {
		if (head == null) {
			throw new LinkedListEmptyException();
		}
		int value = head.value;
		head = head.next;
		return value;
	}

	public void push(int value) {
		Node oldHead = head;
		head = new Node();
		head.value = value;
		head.next = oldHead;
	}

	public static void main(String args[]) {
		StackLinkedList list = new StackLinkedList();
		list.push(20);
		list.push(50);
		list.push(80);
		list.push(40);
		list.push(60);
		list.push(75);
		System.out.println("Element removed from LinkedList: " + list.pop());
		System.out.println("Element removed from LinkedList: " + list.pop());
		System.out.println("Element removed from LinkedList: " + list.pop());
		printList(list.head);
	}

	public static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
}

class LinkedListEmptyException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public LinkedListEmptyException() {
		super();
	}

	public LinkedListEmptyException(String message) {
		super(message);
	}
}