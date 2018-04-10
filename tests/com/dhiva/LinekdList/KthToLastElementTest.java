package com.dhiva.LinekdList;

import org.junit.Test;

import com.dhiva.linkedlist.KthToLastElement;
import com.dhiva.linkedlist.LinkedList;
import com.dhiva.linkedlist.Node;

public class KthToLastElementTest {
	@Test
	public void test() {
		KthToLastElement obj1 = new KthToLastElement();
		LinkedList obj = new LinkedList();
		obj.insertNode(4);
		obj.insertNode(3);
		obj.insertNode(2);
		obj.insertNode(1);
//		obj.insertNode(4);
		Node head = obj.getHead();
		System.out.println(obj1.getKToLastElement(head,2));
	}
}
