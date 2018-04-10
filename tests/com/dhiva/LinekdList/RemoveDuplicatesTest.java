package com.dhiva.LinekdList;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedList;
import com.dhiva.linkedlist.Node;
import com.dhiva.linkedlist.RemoveDuplicates;

public class RemoveDuplicatesTest {
	@Test
	public void test() {
		RemoveDuplicates obj1 = new RemoveDuplicates();
		LinkedList obj = new LinkedList();
		obj.insertNode(1);
		obj.insertNode(3);
		obj.insertNode(2);
		obj.insertNode(1);
		obj.deleteNode(4);
		obj.insertNode(4);
		Node head = obj.getHead();
		Node node = obj1.removeDups(head);
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
}
