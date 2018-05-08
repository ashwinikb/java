/**
 * 
 */
package com.github.ashwinikb.collections;

/**
 * @author ashwini
 *
 */
public class StackArray {
	int size;
	int arr[];
	int top;

	public StackArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}

	public void push(int addElement) {
		if (!isFull()) {
			top++;
			System.out.println("Added Element to Stack" + addElement);
		} else {
			System.out.println("Stack is Full !");
		}
	}

	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped an Element from the Stack" + arr[returnedTop]);
			return arr[returnedTop];
		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}
	public int peek() {
		return arr[top];
	}

	private boolean isEmpty() {
		return (top == -1);
	}

	private boolean isFull() {
		return (size - 1) == top;
	}
	public static void main(String[] args) {
		StackArray StackCustom = new StackArray(10);
		StackCustom.pop();
		StackCustom.push(1);
		StackCustom.push(2);
		StackCustom.push(3);
		StackCustom.push(4);
		StackCustom.pop();
		StackCustom.pop();
		StackCustom.pop();
	}

}
