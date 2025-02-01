package com.Queue;

import java.util.PriorityQueue;


public class LearnQueue {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
//		note: PriorityQueue is auto sorted
		
		//add() : used to add or append the object/element
		q.add(10);
		q.add(5);
		q.add(9);
		q.add(3);
		System.out.println(q);// [3, 5, 9, 10]
		
		//peek()
		System.out.println(q.peek()); // 3
		System.out.println(q); // [3, 5, 9, 10]
		
		//poll()
		System.out.println(q.poll()); // 3
		System.out.println(q); // [5, 10, 9]
	
		
		

	}

}
