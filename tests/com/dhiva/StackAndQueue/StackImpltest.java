package com.dhiva.StackAndQueue;

import org.junit.Test;

import com.dhiva.StackAndQueues.StackImpl;


public class StackImpltest {
	@Test
	public void test() {
		StackImpl<Integer> obj = new StackImpl<>();
		System.out.println(obj.isEmpty());
		obj.pop();
		obj.push(2);
		obj.push(3);
		obj.push(5);
		obj.push(6);
		obj.push(10);
		obj.push(20);
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.peek());
	}
}
