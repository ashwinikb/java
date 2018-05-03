/**
 * 
 */
package com.github.ashwinikb.collections;

import linkedlist.Node;

/**
 * @author ashwini
 *
 */
public class LinkedListLoop {
	private static Node head;
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
		public void addElement(Node node) {
			if(head == null) {
				head = node;
			}else {
				Node temp = head;
				while(temp.next != null) {
					temp = temp.next;
					temp.next = node;
					
				}
			}
			
		}
		
		public void print(Node head) {
			Node temp = head;
			if(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		
		public Node linkedLoop(Node node) {
			Node slowPointer = head; 
			Node fastPointer = head;
			boolean loopExists = false;
			
				while (fastPointer != null && fastPointer.next != null) {
					slowPointer = slowPointer.next;
					fastPointer = fastPointer.next.next;
					if(slowPointer == fastPointer) {
						loopExists = true;
						break;
					}
				}
				if(loopExists) {
					slowPointer=head;
					while(slowPointer !=fastPointer) {
						slowPointer=slowPointer.next;
						fastPointer=fastPointer.next;
					}		 
				}else {
					System.out.println("Loop does not exists");
					slowPointer=null;
				}	
				return slowPointer;
		}
	}
	

}
