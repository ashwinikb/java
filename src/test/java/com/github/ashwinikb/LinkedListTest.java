package com.example.ashwinikb;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test() {

		ListNode l1 = buildListNode(List.of(7, 8, 9));
		ListNode l2 = buildListNode(List.of(5, 6, 7));

		ListNode result = LinkedList.addTwoNumbers(l1, l2);
		LinkedList.printList(result);

		// 789
		// 567
		// 2 5 7 1

	}

	private ListNode buildListNode(List<Integer> data) {

		ListNode l = new ListNode(data.get(0));
		l.next = new ListNode(data.get(1));
		l.next.next = new ListNode(data.get(2));
		return l;
	}

	@Test
	public void test2() {

		ListNode l1 = buildListNode(List.of(2, 4, 3));
		ListNode l2 = buildListNode(List.of(5, 6, 4));

		ListNode result = LinkedList.addTwoNumbers(l1, l2);
		LinkedList.printList(result);

	}
	
	

}
