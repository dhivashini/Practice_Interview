package com.dhiva.LinekdList;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedList;
import com.dhiva.linkedlist.Node;
import com.dhiva.linkedlist.PartitionLL;

public class PartitionLLTest {
	@Test
	public void test() {
		PartitionLL obj1 = new PartitionLL();
		LinkedList obj = new LinkedList();
		obj.insertNode(10);
		obj.insertNode(6);
		obj.insertNode(2);
		obj.insertNode(1);
//		obj.deleteNode(4);
		obj.insertNode(4);
		obj.insertNode(3);
		obj.insertNode(1);
		Node head = obj.getHead();
		Node node = obj1.partitionLL(head, 3);
		while (node != null) {
			System.out.println(node.value);
			node = node.next;
		}
	}
}
