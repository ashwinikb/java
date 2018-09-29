package com.github.ashwinikb.collections;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> queue1;
	Queue<Integer> queue2;

	StackUsingQueue() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}

	public void push(int v) {
		if (queue1.size() == 0) {
			queue1.add(v);
		} else {
			int sizeOfQueue1 = queue1.size();
			// copy elements from queue1 to queue2.
			for (int i = 0; i < sizeOfQueue1; i++)
				queue2.add(queue1.remove());
			queue1.add(v);

			// copy back elements from queue2 to queue1.
			for (int j = 0; j < sizeOfQueue1; j++)
				queue1.add(queue2.remove());
		}
	}

	public int pop() {
		if (queue1.size() == 0)
			throw new QueueEmptyException("UnderFlow Exception");
		return queue1.remove();
	}

	public static void main(String[] args) {
		StackUsingQueue stack = new StackUsingQueue();
		stack.push(20);
		stack.push(40);
		stack.push(70);
		stack.push(50);
		stack.push(90);
		stack.push(110);
		stack.push(30);
		System.out.println("Removed element : " + stack.pop());
		stack.push(170);
		System.out.println("Removed element : " + stack.pop());
	}
}

class QueueEmptyException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public QueueEmptyException() {
		super();
	}

	public QueueEmptyException(String message) {
		super(message);
	}
}
