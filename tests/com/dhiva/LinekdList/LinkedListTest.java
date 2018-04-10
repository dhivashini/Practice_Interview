package com.dhiva.LinekdList;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedList;
import com.dhiva.linkedlist.Node;

public class LinkedListTest {
	@Test
	public void test() {
		LinkedList obj = new LinkedList();
		obj.insertNode(1);
//		obj.insertNode(3);
//		obj.insertNode(2);
//		obj.insertNode(1);
//		obj.deleteNode(4);
//		obj.insertNode(4);
		obj.deleteNode(1);
		Node head = obj.getHead();
		while(head!=null) {
			System.out.println(head.value);
			head = head.next;
		}
	}
}
