package com.dhiva.LinekdList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dhiva.linkedlist.LinkedListPalindrome;
import com.dhiva.linkedlist.Node;

public class LinkedListPalindromeTest {
	@Test
	public void test() {
		Node n1 = new Node(0, null);
		Node n2 = new Node(1, n1);
		Node n3 = new Node(2, n2);
		Node n4 = new Node(1, n3);
		Node n5 = new Node(0, n4);
		LinkedListPalindrome obj = new LinkedListPalindrome();
		boolean output = obj.isPalindrome(n5);
		boolean expected = true;
		assertEquals(expected, output);
	}

	@Test
	public void test1() {
		Node n1 = new Node(0, null);
		Node n2 = new Node(1, n1);
		Node n3 = new Node(0, n2);
		Node n4 = new Node(0, n3);
		Node n5 = new Node(1, n4);
		Node n6 = new Node(0, n5);
		LinkedListPalindrome obj = new LinkedListPalindrome();
		boolean output = obj.isPalindrome(n6);
		boolean expected = true;
		assertEquals(expected, output);
	}

	@Test
	public void test2() {
		Node n1 = new Node(0, null);
		Node n2 = new Node(1, n1);
		Node n3 = new Node(0, n2);
		Node n4 = new Node(0, n3);
		Node n5 = new Node(1, n4);
		Node n6 = new Node(0, n5);
		LinkedListPalindrome obj = new LinkedListPalindrome();
		boolean output = obj.isPalindrome(n6);
		boolean expected = true;
		assertEquals(expected, output);
	}

	@Test
	public void test3() {
		Node n1 = new Node(0, null);
		Node n2 = new Node(1, n1);
		Node n3 = new Node(2, n2);
		Node n4 = new Node(1, n3);
		Node n5 = new Node(0, n4);
		LinkedListPalindrome obj = new LinkedListPalindrome();
		boolean output = obj.isPalindrome(n5);
		boolean expected = true;
		assertEquals(expected, output);
	}

	@Test
	public void test4() {
		Node n8 = new Node(1);
		LinkedListPalindrome obj = new LinkedListPalindrome();
		boolean output = obj.isPalindrome(n8);
		boolean expected = true;
		assertEquals(expected, output);
	}

	@Test
	public void test5() {
		Node n1 = new Node(0, null);
		Node n2 = new Node(1, n1);
		LinkedListPalindrome obj = new LinkedListPalindrome();
		boolean output = obj.isPalindrome(n2);
		boolean expected = false;
		assertEquals(expected, output);
	}

	@Test
	public void test6() {
		Node n1 = new Node(0, null);
		LinkedListPalindrome obj = new LinkedListPalindrome();
		boolean output = obj.isPalindrome(n1);
		boolean expected = true;
		assertEquals(expected, output);
	}
}
