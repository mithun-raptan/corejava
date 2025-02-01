package com.List;

import java.util.LinkedList;

public class LearnLinkedList {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		//add(Object obj)
		l.add(20);
		l.add(10);
		l.add(30);
		l.add(null);
		l.add("sheela");
		System.out.println(l);
		
		//peek()
		System.out.println(l.peek());//20
		
		//poll() : retrieves first object/element from the LinkedList.
		System.out.println(l.poll());//20
		System.out.println(l); //[10, 30, null, sheela]
	
		
		
	}
}
