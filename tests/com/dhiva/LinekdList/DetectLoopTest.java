package com.dhiva.LinekdList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.linkedlist.DetectLoop;
import com.dhiva.linkedlist.Node;

public class DetectLoopTest {
	@Test
	public void test() {
		Node n1 = new Node(20, null);
		Node n2 = new Node(20, null);
		n1.next = n2;
		n2.next = n1;
		DetectLoop obj = new DetectLoop();
		boolean hasLoop = obj.hasLoop(n1);
		boolean expected = true;
		assertEquals(expected, hasLoop);
	}

	@Test
	public void test1() {
		Node n1 = new Node(20, null);
		Node n2 = new Node(21, n1);
		Node n3 = new Node(22, n2);
		Node n4 = new Node(23, n3);
		n1.next = n4;
		DetectLoop obj = new DetectLoop();
		boolean hasLoop = obj.hasLoop(n1);
		boolean expected = true;
		assertEquals(expected, hasLoop);
	}
	
	@Test
	public void test2() {
		Node n1 = new Node(20, null);
		Node n2 = new Node(21, n1);
		Node n3 = new Node(22, n2);
		Node n4 = new Node(23, n3);
//		n4.next = null;
		DetectLoop obj = new DetectLoop();
		boolean hasLoop = obj.hasLoop(n4);
		boolean expected = false;
		assertEquals(expected, hasLoop);
	}
}
