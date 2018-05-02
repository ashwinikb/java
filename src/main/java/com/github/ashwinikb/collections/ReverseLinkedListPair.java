/**
 * 
 */
package com.github.ashwinikb.collections;

/**
 * @author ashwini
 *
 */
public class ReverseLinkedListPair {
	private static Node head;
	
	
	public static class Node{
		private Node next;
		private int data;

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
				while(temp != null) {
					System.out.println(temp.data);
					temp = temp.next;
				}
			}
			
			public static Node reversedInPair(Node head) {
				Node current = head;
				Node temp = null;
				Node newHead = null;
				while(current != null && current.next != null) {
					temp = current.next;
					current.next = temp.next;
					temp.next = current;	
				
				if (newHead == null)
					newHead = temp;
				current=current.next;
			}
				
				return head;
				
			}
	}
}

			

