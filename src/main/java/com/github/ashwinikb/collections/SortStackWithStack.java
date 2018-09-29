/**
 * 
 */
package com.github.ashwinikb.collections;

import java.util.Stack;

public class SortStackWithStack {
	int size;
	int arr[];
	int top;

	SortStackWithStack(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int element) {
		if (!isFull()) {
			top++;
			arr[top] = element;
		} else {
			System.out.println("Stack is full !");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedElement = top;
			top--;
			return arr[returnedElement];
		} else {
			System.out.println("Stack is Empty");
		}
		return size;
	}

	public int peek() {
		return arr[top];
	}

	private boolean isEmpty() {
		return (top == -1);
	}

	private boolean isFull() {
		return size - 1 == top;
	}

	public static void main(String[] args) {
		SortStackWithStack stackCustom = new SortStackWithStack(10);
		stackCustom.push(10);
		stackCustom.push(30);
		stackCustom.push(50);
		stackCustom.push(40);
		stackCustom.printStack(stackCustom);
		SortStackWithStack sortedStack = sortStack(stackCustom);
		System.out.println("After Sorting :");
		sortedStack.printStack(sortedStack);

	}

	public static SortStackWithStack sortStack(SortStackWithStack stack) {
		SortStackWithStack tempStack = new SortStackWithStack(10);
		while (!stack.isEmpty()) {
			int currentData = stack.pop();
			while (!tempStack.isEmpty() && tempStack.peek() > currentData) {
				stack.push(tempStack.pop());
			}
			tempStack.push(currentData);
		}
		return tempStack;
	}

	public void printStack(SortStackWithStack stack) {
		if (top >= 0) {
			System.out.println("Elements of the stack are: ");
			for (int i = 0; i <= top; i++) {
				System.out.println(arr[i]);
			}
		}

	}

}
