package com.dhiva.StackAndQueue;

import org.junit.Test;

import com.dhiva.StackAndQueues.MinStack;

public class MinStackTest {
	@Test
	public void test() {
		MinStack obj = new MinStack();
		System.out.println(obj.isEmpty());
		obj.push(2);
		obj.push(3);
		obj.push(5);
		obj.push(6);
		obj.push(10);
		obj.push(20);
		obj.push(1);

		System.out.println("min"+obj.min());
		System.out.println(obj.pop());
		System.out.println("min"+obj.min());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println(obj.pop());
		System.out.println("min"+obj.min());
		System.out.println(obj.peek());
		System.out.println("min"+obj.min());
		System.out.println(obj.pop());
		System.out.println("min"+obj.min());
		System.out.println(obj.pop());
		System.out.println("min"+obj.min());
		System.out.println(obj.pop());
		System.out.println("min"+obj.min());
		obj.push(4);
		System.out.println(obj.min());
	}
	
}
