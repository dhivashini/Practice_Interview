package com.dhiva.LinekdList;

import org.junit.Test;

import com.dhiva.linkedlist.Node;
import com.dhiva.linkedlist.ReverseLL;

public class ReverseLLTest {
	@Test
	public void test() {
		Node n1 = new Node(20, null);
		Node n2 = new Node(1, n1);
		Node n3 = new Node(2, n2);
		Node n4 = new Node(21, n3);
		Node n5 = new Node(24, n4);
		ReverseLL obj= new ReverseLL();
		
		Node res = obj.reverseList(n5);
		while(res!=null){
			System.out.println(res.value);
			res = res.next;
		}
	}
}
