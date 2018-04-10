package com.dhiva.StackAndQueue;

import org.junit.Test;

import com.dhiva.StackAndQueues.QueueImpl;

public class QueueImplTest {
	@Test
	public void test() {
		QueueImpl<Integer> obj = new QueueImpl<>();
		System.out.println(obj.isEmpty());
//		obj.remove();
		obj.add(2);
		obj.add(3);
		obj.add(5);
		obj.add(6);
		obj.add(10);
		obj.add(20);
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj.peek());
	}
}
